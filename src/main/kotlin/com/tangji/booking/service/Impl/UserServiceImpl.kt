package com.tangji.booking.service.Impl

import com.tangji.booking.data.dto.UserDto
import com.tangji.booking.repository.UserRepository
import com.tangji.booking.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(val userRepository: UserRepository) : UserService {
    override fun addUser(userDto: UserDto) = userRepository.save(userDto.trans2Entity()).trans2Dto();

    override fun findUserById(id: Long): UserDto = userRepository.findById(id).map {
        it.trans2Dto();
    }.orElseThrow {
        RuntimeException();
    };

    override fun modifyUser(userDto: UserDto) = userRepository.findById(userDto.id).orElseThrow {
        RuntimeException()
    }.apply {
        this.name = userDto.userName;
        this.age = userDto.age;
        userRepository.save(this)
    }.run {
        this.trans2Dto();
    };

    override fun removeUserById(id: Long) = userRepository.deleteById(id);
}
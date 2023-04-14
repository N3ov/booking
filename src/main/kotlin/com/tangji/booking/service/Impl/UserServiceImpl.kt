package com.tangji.booking.service.Impl

import com.tangji.booking.data.dto.UserDto
import com.tangji.booking.repository.UserRepository
import com.tangji.booking.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(val userRepository: UserRepository) : UserService {
    override fun addUser(userDto: UserDto) = userRepository.save(userDto.trans2Entity()).trans2Dto();

    override fun findUserById(id: Long): UserDto {
        val user = userRepository.findById(id).orElseThrow {
            NoSuchElementException("User with id $id not found")
        }
        return user.trans2Dto()
    }

    override fun modifyUser(userDto: UserDto) = userRepository.findById(userDto.id).orElseThrow {
        RuntimeException()
    }.apply {
        this.name = userDto.userName
        this.email = userDto.email
        this.password = userDto.password
        userRepository.save(this)
    }.run {
        this.trans2Dto()
    }

    override fun removeUserById(id: Long) = userRepository.deleteById(id);
}
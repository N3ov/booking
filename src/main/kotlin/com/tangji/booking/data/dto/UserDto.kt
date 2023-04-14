package com.tangji.booking.data.dto

import com.tangji.booking.data.entity.UserEntity

data class UserDto(
    val id: Long,
    var userName: String,
    var age: Int
) {
    fun trans2Entity() = UserEntity(this.id, this.userName, this.age)
}

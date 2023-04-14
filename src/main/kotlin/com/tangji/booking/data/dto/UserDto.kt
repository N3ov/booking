package com.tangji.booking.data.dto

import com.tangji.booking.data.entity.UserEntity

data class UserDto(
    val id: Long,
    var userName: String,
    var email: String,
    var password: String
) {
    fun trans2Entity() = UserEntity(this.id, this.userName, this.email, this.password)
}

package com.tangji.booking.data.entity

import com.tangji.booking.data.dto.UserDto
import javax.persistence.*

@Entity
@Table(name = "user")
data class UserEntity (

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Long?,

    @Column
    var name: String,

    @Column
    var age: Int

) {
    fun trans2Dto(): UserDto = UserDto(this.id!!, this.name, this.age);
}
package com.tangji.booking.data.entity

import com.tangji.booking.data.dto.UserDto
import javax.persistence.*

@Entity
@Table(name = "user", schema = "public")
data class UserEntity (

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val userId: Long?,

    @Column
    var name: String,

    @Column
    var email: String,

    @Column
    var password: String

) {
    fun trans2Dto(): UserDto = UserDto(this.userId!!, this.name, this.email, this.password);
}
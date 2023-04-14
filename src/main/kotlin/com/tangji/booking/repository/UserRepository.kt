package com.tangji.booking.repository

import com.tangji.booking.data.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<UserEntity, Long>, JpaSpecificationExecutor<UserEntity> {
}
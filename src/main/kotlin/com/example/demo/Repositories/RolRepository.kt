package com.example.demo.Repositories

import com.example.demo.Entities.RolEntity
import org.springframework.data.jpa.repository.JpaRepository

interface RolRepository: JpaRepository<RolEntity, Long> {}
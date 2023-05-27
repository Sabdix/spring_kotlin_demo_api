package com.example.demo.Repositories

import com.example.demo.Entities.ParametrosGeneralesEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ParametrosGeneralesRepository: JpaRepository<ParametrosGeneralesEntity, Long> {
}
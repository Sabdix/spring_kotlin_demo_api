package com.example.demo.Repositories

import com.example.demo.Entities.OrigenGanadoEntity
import org.springframework.data.jpa.repository.JpaRepository

interface OrigenGanadoRepository: JpaRepository<OrigenGanadoEntity, Long> {
}
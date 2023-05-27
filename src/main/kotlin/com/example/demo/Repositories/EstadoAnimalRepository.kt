package com.example.demo.Repositories

import com.example.demo.Entities.EstadoAnimalEntity
import org.springframework.data.jpa.repository.JpaRepository

interface EstadoAnimalRepository: JpaRepository<EstadoAnimalEntity, Long> {
}
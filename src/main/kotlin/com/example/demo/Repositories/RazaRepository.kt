package com.example.demo.Repositories

import com.example.demo.Entities.RazaEntity
import org.springframework.data.jpa.repository.JpaRepository

interface RazaRepository: JpaRepository<RazaEntity, Long> {
}
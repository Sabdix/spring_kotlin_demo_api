package com.example.demo.Repositories

import com.example.demo.Entities.SexoEntity
import org.springframework.data.jpa.repository.JpaRepository

interface SexoRepository : JpaRepository<SexoEntity, Long> {
}
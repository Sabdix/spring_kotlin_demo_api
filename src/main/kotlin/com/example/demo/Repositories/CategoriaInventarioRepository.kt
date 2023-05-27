package com.example.demo.Repositories

import com.example.demo.Entities.CategoriaInventarioEntity
import org.springframework.data.jpa.repository.JpaRepository

interface CategoriaInventarioRepository: JpaRepository<CategoriaInventarioEntity, Long> {
}
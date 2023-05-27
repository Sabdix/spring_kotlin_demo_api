package com.example.demo.Repositories

import com.example.demo.Entities.SubCategoriaInventarioEntity
import org.springframework.data.jpa.repository.JpaRepository

interface SubCategoriaInventarioRepository: JpaRepository<SubCategoriaInventarioEntity, Long> {
}
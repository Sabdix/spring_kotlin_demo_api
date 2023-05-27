package com.example.demo.Repositories

import com.example.demo.Entities.TipoProductoEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TipoProductoRepository: JpaRepository<TipoProductoEntity, Long> {
}
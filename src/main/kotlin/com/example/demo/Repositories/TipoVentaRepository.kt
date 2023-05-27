package com.example.demo.Repositories

import com.example.demo.Entities.TipoVentaEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TipoVentaRepository: JpaRepository<TipoVentaEntity, Long> {
}
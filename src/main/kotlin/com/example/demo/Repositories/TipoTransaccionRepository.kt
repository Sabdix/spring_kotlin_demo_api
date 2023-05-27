package com.example.demo.Repositories

import com.example.demo.Entities.TipoTransaccionEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TipoTransaccionRepository: JpaRepository<TipoTransaccionEntity, Long> {
}
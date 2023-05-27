package com.example.demo.Repositories

import com.example.demo.Entities.TipoPrenezEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TipoPrenezRepository: JpaRepository<TipoPrenezEntity, Long> {
}
package com.example.demo.Entities

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "CAT_BULLSOFT_RAZA")
data class RazaEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val idRaza: Long,
        val raza: String,
        val fechaAlta: Date,
        val fechaBaja: Date,
        val activo: Boolean
)

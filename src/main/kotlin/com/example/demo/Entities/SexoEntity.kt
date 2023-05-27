package com.example.demo.Entities

import jakarta.persistence.*
import java.util.Date
@Entity
@Table(name = "CAT_BULLSOFT_SEXO")
data class SexoEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val idSexo: Long,
        val sexo: String,
        val fechaAlta: Date,
        val fechaBaja: Date,
        val activo: Boolean
) {}


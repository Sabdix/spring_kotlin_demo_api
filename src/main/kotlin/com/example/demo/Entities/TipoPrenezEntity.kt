package com.example.demo.Entities

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "CAT_BULLSOFT_TIPO_PRENEZ")
class TipoPrenezEntity (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val idTipoPrenez: Long,
        val tipoPrenez: String,
        val fechaAlta: Date,
        val fechaBaja: Date,
        val activo: Boolean
)
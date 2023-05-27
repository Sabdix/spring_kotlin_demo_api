package com.example.demo.Entities

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "CAT_BULLSOFT_PARAMETROS_GENERALES")
class ParametrosGeneralesEntity (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val idParametro: Long,
        val valorKilo: String,
)
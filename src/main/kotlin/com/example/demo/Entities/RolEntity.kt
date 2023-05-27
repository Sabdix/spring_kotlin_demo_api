package com.example.demo.Entities

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "CAT_BULLSOFT_ROLES")
class RolEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val idRol: Long,
        val rol: String,
        val fechaAlta: Date,
        val fechaBaja: Date,
        val activo: Boolean
)
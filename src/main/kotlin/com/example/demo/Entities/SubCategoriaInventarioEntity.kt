package com.example.demo.Entities

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "CAT_BULLSOFT_SUB_CATEGORIA_INVENTARIO")
class SubCategoriaInventarioEntity (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val idSubCategoria: Long,
        val descripcion: String,
        val activo: Boolean
)
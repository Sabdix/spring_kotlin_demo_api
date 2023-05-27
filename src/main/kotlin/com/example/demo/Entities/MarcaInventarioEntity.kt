package com.example.demo.Entities

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "CAT_BULLSOFT_MARCA_INVENTARIO")
class MarcaInventarioEntity (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val idMarca: Long,
        val descripcion: String,
        val activo: Boolean
)
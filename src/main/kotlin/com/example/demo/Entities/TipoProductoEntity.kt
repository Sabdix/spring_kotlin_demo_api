package com.example.demo.Entities

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name ="CAT_BULLSOFT_TIPO_PRODUCTO")
class TipoProductoEntity (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val idTipoProducto: Long,
        val tipo: String,
        val fechaAlta: Date,
        val fechaBaja: Date,
        val activo: Boolean
)
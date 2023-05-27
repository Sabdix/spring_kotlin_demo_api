package com.example.demo.Entities

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*
@Entity
@Table(name = "CAT_BULLSOFT_TIPO_VENTA")
class TipoVentaEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val idTipoVenta: Long,
        val tipoVenta: String,
        val activo: Boolean
)
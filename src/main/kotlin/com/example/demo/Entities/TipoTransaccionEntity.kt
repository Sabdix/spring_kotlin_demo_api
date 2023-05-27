package com.example.demo.Entities

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "CAT_BULLSOFT_TIPO_TRANSACCION")
class TipoTransaccionEntity (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val idTipoTransaccion: Long,
        val tipoTransaccion: String,
        val fechaAlta: Date,
        val fechaBaja: Date,
        val activo: Boolean
)
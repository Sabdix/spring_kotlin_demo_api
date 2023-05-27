package com.example.demo.Entities

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "CAT_BULLSOFT_ORIGEN_GANADO")
class OrigenGanadoEntity (
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val idOrigenGanado: Long,
  val origenGanado: String,
  val fechaAlta: Date,
  val fechaBaja: Date,
  val activo: Boolean
)
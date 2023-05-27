package com.example.demo.Entities

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "CAT_BULLSOFT_ESTADO_ANIMAL")
class EstadoAnimalEntity (
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val idEstadoAnimal: Long,
  val estadoAnimal: String,
  val fechaAlta: Date,
  val fechaBaja: Date,
  val activo: Boolean
)
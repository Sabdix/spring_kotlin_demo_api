package com.example.demo.Entities

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "CAT_BULLSOFT_CATEGORIA_INVENTARIO")
class CategoriaInventarioEntity (
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val idCategoria: Long,
  val descripcion: String,
  val activo: Boolean
)
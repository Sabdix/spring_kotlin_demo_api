package com.example.demo.Repositories

import com.example.demo.Entities.MarcaInventarioEntity
import org.springframework.data.jpa.repository.JpaRepository

interface MarcaInventarioRepository: JpaRepository<MarcaInventarioEntity, Long> {
}
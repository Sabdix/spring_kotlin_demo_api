package com.example.demo.Controllers

import com.example.demo.Builders.ResponseBuilder
import com.example.demo.Dtos.WsResponse
import com.example.demo.Entities.SexoEntity
import com.example.demo.Repositories.SexoRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/catalog")
class CatalogController(
        private val sexoRepository: SexoRepository
) {
  @GetMapping("/sexo")
  fun GetSexos() : WsResponse<List<SexoEntity>> = ResponseBuilder().buildCorrectResponse(sexoRepository.findAll())
}
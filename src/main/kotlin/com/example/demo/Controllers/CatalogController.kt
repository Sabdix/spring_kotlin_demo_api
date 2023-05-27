package com.example.demo.Controllers

import com.example.demo.Builders.ResponseBuilder
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController

class CatalogController {
  @GetMapping("/")
  fun index() = ResponseBuilder().buildCorrectResponse(null)
}
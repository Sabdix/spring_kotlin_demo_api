package com.example.demo.Controllers

import com.example.demo.Builders.ResponseBuilder
import com.example.demo.Dtos.WsResponse
import com.example.demo.Entities.*
import com.example.demo.Repositories.*
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/catalog")
class CatalogController(
        private val sexoRepository: SexoRepository,
        private val razaRepository: RazaRepository,
        private val rolRepository: RolRepository,
        private val tipoPrenezRepository: TipoPrenezRepository,
        private val tipoVentaRepository: TipoVentaRepository,
        private val tipoTransaccionRepository: TipoTransaccionRepository,
        private val tipoProductoRepository: TipoProductoRepository,
        private val categoriaInventarioRepository: CategoriaInventarioRepository,
        private val subCategoriaInventarioRepository: CategoriaInventarioRepository,
        private val parametrosGeneralesRepository: ParametrosGeneralesRepository,
        private val origenGanadoRepository: OrigenGanadoRepository,
        private val marcaInventarioRepository: MarcaInventarioRepository,
        private val estadoAnimalRepository: EstadoAnimalRepository
        ) {
  @GetMapping("/sexo")
  fun GetSexos(): WsResponse<List<SexoEntity>> = ResponseBuilder().buildCorrectResponse(sexoRepository.findAll())

  @GetMapping("/raza")
  fun GetRazas(): WsResponse<List<RazaEntity>> = ResponseBuilder().buildCorrectResponse(razaRepository.findAll())

  @GetMapping("/rol")
  fun GetRoles(): WsResponse<List<RolEntity>> = ResponseBuilder().buildCorrectResponse(rolRepository.findAll())

  @GetMapping("/tipo_prenez")
  fun GetTipoPrenez(): WsResponse<List<TipoPrenezEntity>> = ResponseBuilder().buildCorrectResponse(tipoPrenezRepository.findAll())

  @GetMapping("/tipo_venta")
  fun GetTipoVenta(): WsResponse<List<TipoVentaEntity>> = ResponseBuilder().buildCorrectResponse(tipoVentaRepository.findAll())

  @GetMapping("/tipo_transaccion")
  fun GetTipoTransaccion(): WsResponse<List<TipoTransaccionEntity>> = ResponseBuilder().buildCorrectResponse(tipoTransaccionRepository.findAll())

  @GetMapping("/tipo_producto")
  fun GetTipoProducto(): WsResponse<List<TipoProductoEntity>> = ResponseBuilder().buildCorrectResponse(tipoProductoRepository.findAll())

  @GetMapping("/categoria_inventario")
  fun GetCategoriaInventario(): WsResponse<List<CategoriaInventarioEntity>> = ResponseBuilder().buildCorrectResponse(categoriaInventarioRepository.findAll())

  @GetMapping("/sub_categoria_inventario")
  fun GetSubCategoriaInventario(): WsResponse<List<CategoriaInventarioEntity>> = ResponseBuilder().buildCorrectResponse(subCategoriaInventarioRepository.findAll())

  @GetMapping("/parametros_generales")
  fun GetParametrosGenerales(): WsResponse<List<ParametrosGeneralesEntity>> = ResponseBuilder().buildCorrectResponse(parametrosGeneralesRepository.findAll())

  @GetMapping("/origen_ganado")
  fun GetOrigenGanado(): WsResponse<List<OrigenGanadoEntity>> = ResponseBuilder().buildCorrectResponse(origenGanadoRepository.findAll())

  @GetMapping("/marca_inventario")
  fun GetMarcaInventario(): WsResponse<List<MarcaInventarioEntity>> = ResponseBuilder().buildCorrectResponse(marcaInventarioRepository.findAll())

  @GetMapping("/estado_animal")
  fun GetEstadoAnimal(): WsResponse<List<EstadoAnimalEntity>> = ResponseBuilder().buildCorrectResponse(estadoAnimalRepository.findAll())

}
package com.example.demo.Builders

import com.example.demo.Catalogs.ResponseCatalogs
import com.example.demo.Dtos.WsResponse

class ResponseBuilder {

  fun <T> buildCorrectResponse(model: T): WsResponse<T> {
    return WsResponse(
            ResponseCatalogs.OK.code,
            ResponseCatalogs.OK.messaage,
            true,
            model)
  }

  fun <T> buildErrorResponse(model: T): WsResponse<T> {
    return WsResponse(
            ResponseCatalogs.ERROR.code,
            ResponseCatalogs.ERROR.messaage,
            false,
            model)
  }

  fun <T> buildResponse(model: T, code: Int, message: String, status: Boolean): WsResponse<T> {
    return WsResponse(
            code,
            message,
            status,
            model)
  }
}
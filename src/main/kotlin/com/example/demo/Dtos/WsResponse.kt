package com.example.demo.Dtos

class WsResponse<T>(val code: Int, val message: String, val status: Boolean, val model: T) {
}
package com.example.todoapp21.network

import com.example.todoapp21.model.Todo
import retrofit2.http.GET

interface TodosApi {
    @GET("todos")
    suspend fun getTodos(): List<Todo>
}
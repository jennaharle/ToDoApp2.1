package com.example.todoapp21.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todoapp21.model.Todo
import com.example.todoapp21.network.ApiService
import kotlinx.coroutines.launch

class TodoViewModel : ViewModel() {
    private val _todos = mutableStateListOf<Todo>()
    val todos: List<Todo> get() = _todos

    init {
        getTodosList()
    }

    private fun getTodosList() {
        viewModelScope.launch {
            try {
                val todosFromApi = ApiService.getInstance().getTodos()
                _todos.addAll(todosFromApi)
            } catch (e: Exception) {

            }
        }
    }
}
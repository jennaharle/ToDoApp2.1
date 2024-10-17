package com.example.todoapp21.ui.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.todoapp21.model.Todo
import com.example.todoapp21.viewmodel.TodoViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainActivityScreen()
        }
    }
}

@Composable
fun TodoList(todos: List<Todo>) {
    LazyColumn {
        items(todos) { todo ->
            Text(
                text = todo.title)
        }
    }
}

@Composable
fun TodoScreen(todoList: List<Todo>) {
    LazyColumn {
        items(todoList) { todo ->
            Text(text = todo.title)
        }
    }
}

@Composable
fun MainActivityScreen(viewModel: TodoViewModel = viewModel()) {
    TodoScreen(todoList = viewModel.todos)
}

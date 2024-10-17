package com.example.todoapp21.model

import com.google.gson.annotations.SerializedName

data class Todo(
    @SerializedName("userId") val userId: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("completed") val completed: Boolean
)

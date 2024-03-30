package com.example.oxygo_t2

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(

    val firstName: String,
    val lastName: String,
    val id: String,
    @PrimaryKey(autoGenerate = true)
    val key: Int = 0
)

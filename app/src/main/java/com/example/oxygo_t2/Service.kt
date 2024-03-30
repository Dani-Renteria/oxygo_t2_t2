package com.example.oxygo_t2

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Service(
    val name: String,
    val price: Int,
    val description: String,
    val user: User,
    @PrimaryKey(autoGenerate = true)
    val key: Int = 0

)

package com.example.recyclerview_229

import android.app.Application
import com.example.recyclerview_229.model.UserService

class App: Application() {

    val usersService = UserService()
}
package com.anthony.pokeapi

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
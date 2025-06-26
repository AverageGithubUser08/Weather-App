package com.example.wheaterapp

import kotlinx.serialization.Serializable
import io.ktor.client.call.*
import io.ktor.client.request.*

suspend fun getWeatherData(): WeatherData {
    return KtorClient.client.get("http://0.0.0.0/getWeatherData").body()
}

@Serializable
class WeatherData {
    // Temperature in Degree Celsius
    private var temperature = 0.0

    public fun getTemperature(): Double {
        return temperature;
    }


}
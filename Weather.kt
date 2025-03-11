data class Weather(
    val main: Main,
    val weather: List<WeatherDescription>,
    val wind: Wind,
    val name: String
)

data class Main(val temp: Double, val humidity: Int, val pressure: Int)
data class WeatherDescription(val description: String, val icon: String)
data class Wind(val speed: Double)

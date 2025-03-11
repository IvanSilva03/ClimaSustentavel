class WeatherViewModel : ViewModel() {
    private val repository = WeatherRepository()
    val weather = MutableLiveData<Weather>()

    suspend fun fetchWeather(city: String) {
        viewModelScope.launch {
            weather.value = repository.getWeather(city)
        }
    }
}

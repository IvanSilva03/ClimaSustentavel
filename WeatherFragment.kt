class WeatherFragment : Fragment() {
    private val viewModel: WeatherViewModel by viewModels()

    override fun onCreateView(...) {
        ...
        viewModel.weather.observe(viewLifecycleOwner) { weather ->
            binding.cityName.text = weather.name
            binding.temperature.text = weather.main.temp.toString()
            // ... outras atualizações da UI ...
        }

        lifecycleScope.launch {
            viewModel.fetchWeather("São Paulo") // Exemplo de cidade
        }
        ...
    }
}

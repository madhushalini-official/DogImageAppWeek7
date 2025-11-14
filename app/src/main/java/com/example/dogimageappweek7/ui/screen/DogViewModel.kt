package com.example.dogimageappweek7.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dogimageappweek7.network.RetrofitInstance
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import android.util.Log

data class UiState(
    val isLoading: Boolean = false,
    val images: List<String> = emptyList(),
    val error: String? = null
)

class DogViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(UiState(isLoading = true))
    val uiState: StateFlow<UiState> = _uiState

    init {
        fetchDogImages()
    }

    private fun fetchDogImages() {
        viewModelScope.launch {
            try {
                Log.d("DogViewModel", "Fetching dog images...")
                val response = RetrofitInstance.api.getDogImages()
                Log.d("DogViewModel", "Success: ${response.message.size} images")
                _uiState.value = UiState(images = response.message)
            } catch (e: Exception) {
                Log.e("DogViewModel", "Error fetching data", e)
                _uiState.value = UiState(error = e.message)
            }
        }
    }
}

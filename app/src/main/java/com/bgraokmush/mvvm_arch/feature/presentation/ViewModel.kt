package com.bgraokmush.mvvm_arch.feature.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bgraokmush.mvvm_arch.feature.domain.repository.IRepository
import kotlinx.coroutines.launch

class ViewModel(
    val repository : IRepository
) : ViewModel(){

    init {
        viewModelScope.launch {
            repository.getData()
        }
    }
}
package com.senai.carteirinhadigital.feature.login.presentation

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class LoginViewModel() : ViewModel() {

    private val _uiState = MutableStateFlow(LoginUIState())
    val uiState: StateFlow<LoginUIState> = _uiState.asStateFlow()

    fun onEvent(event: LoginEvent){
        when(event){
            is LoginEvent.OnUsuarioChange -> {
                _uiState.update { state ->
                    state.copy(
                        usuario = event.value,
                        erroMessage = null
                    )
                }
            }

        }
    }

    private fun fazerLogin(){
        val state = _uiState.value

        if (state.usuario.isBlank() || state.senha.isBlank()){
            _uiState.update {
                it.copy(
                    erroMessage = "Preencha login e senha"
                )
            }
            return
        }
        viewModelScope.launch {  }
    }
}
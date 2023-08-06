package com.example.alshema_kotlin.viewmodels.authorization_view_model

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainAuthorizationViewModel : ViewModel() {
    private val _authState = mutableStateOf(MainAuthorizationData())
    var authState: MutableState<MainAuthorizationData> = _authState


    fun changingTextOfTextField(text: String) {
        var state = _authState.value.textFieldState;
        if (state.length < 9){
            _authState.value = authState.value.copy(textFieldState = text)
            var another = _authState.value.textFieldState;
            _authState.value = authState.value.copy(isFilledTextField = another.length >= 9)
            println("state is : $another");
        }

    }
}
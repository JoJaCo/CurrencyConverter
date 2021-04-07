package com.calivera.andriod.currencyconverter.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ServiceLifecycleDispatcher
import androidx.lifecycle.ViewModel

class MainViewModel @ViewModelInject constructor(
    private val repository: MainRepository,
    private val dispatcher:
) : ViewModel(){
}
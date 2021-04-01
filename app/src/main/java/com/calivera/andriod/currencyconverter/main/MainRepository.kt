package com.calivera.andriod.currencyconverter.main

import com.calivera.andriod.currencyconverter.data.models.CurrencyResponse

interface MainRepository {
    suspend fun getRates(base: String): CurrencyResponse

}
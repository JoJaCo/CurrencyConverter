package com.calivera.andriod.currencyconverter.main

import com.calivera.andriod.currencyconverter.data.models.CurrencyResponse
import com.calivera.andriod.currencyconverter.util.Resource

interface MainRepository {
    suspend fun getRates(base: String): Resource<CurrencyResponse>

}
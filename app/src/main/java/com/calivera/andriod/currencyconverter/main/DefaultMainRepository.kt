package com.calivera.andriod.currencyconverter.main

import com.calivera.andriod.currencyconverter.data.models.CurrencyApi
import com.calivera.andriod.currencyconverter.data.models.CurrencyResponse
import com.calivera.andriod.currencyconverter.util.Resource
import java.lang.Exception
import javax.inject.Inject

class DefaultMainRepository @Inject constructor(
    private val api: CurrencyApi
) : MainRepository  {
    override suspend fun getRates(base: String): Resource<CurrencyResponse> {
        return try {
            val response = api.getRates(base)
            val result = response.body()
            if (response.isSuccessful && result != null){
                Resource.Success(result)
            }else{
                Resource.Error(response.message())
            }

        } catch (e : Exception){
            Resource.Error(e.message ?: "An error occured")
        }
    }

}
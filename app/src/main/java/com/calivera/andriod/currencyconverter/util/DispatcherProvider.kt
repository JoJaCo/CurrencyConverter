package com.calivera.andriod.currencyconverter.util

import kotlinx.coroutines.CoroutineDispatcher
import java.util.concurrent.CountDownLatch

interface DispatcherProvider {
    val main: CoroutineDispatcher
    val io: CoroutineDispatcher
    val default: CoroutineDispatcher
    val unconfined: CoroutineDispatcher
}
package com.wanger.springbootwebapp.kotlinunit

import kotlinx.coroutines.*
import java.util.concurrent.Executors

/**
 * start an async operation
 * @author wanger
 * @date 2020年 10月11日
 */

suspend fun takeSomeTime(num: Int): Int {
    delay(1000L)
    return num * 2
}

fun main() = runBlocking {
    println(Thread.currentThread().name)
    val coroutineDispatcher = Executors.newFixedThreadPool(16).asCoroutineDispatcher()
    val job = GlobalScope.launch {
        for (i in 1..32) {
            async(coroutineDispatcher) {
                println(Thread.currentThread().name)
            }
        }
    }
    job.join()
}
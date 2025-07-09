package threads

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


suspend fun longRunningWork()
{
    println("Worker Thread Started")
    println("Worker Thread Name : "+ Thread.currentThread().name+", Worker Thread ID : "+Thread.currentThread().id)
    for (i in 0..9)
    {
        delay(100)
        println("Running Time Left for ${Thread.currentThread().name}: "+ (10-i))
    }
    println("Worker Thread Ended")
}


fun main() = runBlocking {
    println("Main Thread Startrd")
    println("Thread Name : "+ Thread.currentThread().name +", Thread ID : "+Thread.currentThread().id)
    async {  longRunningWork() }
    async {  longRunningWork() }
    println("Main Thread Ended")
}
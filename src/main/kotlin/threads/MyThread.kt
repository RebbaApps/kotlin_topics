package threads

import java.lang.Thread.currentThread
import java.lang.Thread.sleep
import java.util.concurrent.TimeUnit

internal class MyThread(private val threadName: String, val sleepDelay: Long) : Thread(threadName) {

    override fun run() {
        super.run()
        println("Worker Thread Started")
        println("Thread Name " + currentThread().name + ", Thread Id " + currentThread().id)
        for (i in 0..9) {
            try {
                sleep(sleepDelay)
                println("Running Time Left for ${Thread.currentThread().name}: " + (10 - i))
                //println("Running Time Left for ${Thread.currentThread().name}: "+currentThread().id)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }
        println("Worker Thread Ended")
    }
}

fun main() {
    println("Main Thread Started")
    println("Thread Name " + currentThread().name + ", Thread Id : " + currentThread().id)
    MyThread("LongRunningTask_1", 0).start()
    MyThread("LongRunningTask_2", 0).start()
    println("Main Thread Ended")
}
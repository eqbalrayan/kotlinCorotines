import kotlin.concurrent.thread

fun main(args:Array<String>){

    println("Start programe  thread name ->: "+ Thread.currentThread().name)

    thread {

        println("Welcome Kotlin Corotines  here thread name is :" + Thread.currentThread().name )

        Thread.sleep(1000)

    }

    Thread.sleep(2000)


    println("End progarme thread name -> " + Thread.currentThread().name)
}
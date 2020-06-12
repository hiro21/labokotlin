import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {

    GlobalScope.launch {
        println("test1")
    }
    println("test2")

    runBlocking {
        delay(2000L)
    }

}
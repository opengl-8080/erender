package erender

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

fun main(args: Array<String>) {
    SpringApplication.run(Main::class.java, *args).use { context ->
        val m = context.getBean(Main::class.java)
        m.execute()
    }
}

@SpringBootApplication
open class Main {
    
    fun execute() {
        
    }
}

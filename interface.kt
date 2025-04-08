interface CanRun {
    fun run() {
        println("Running!")
    }
}

interface CanSwim {
    fun swim() {
        println("Swimming!")
    }
}

class Duck : CanRun, CanSwim {
    fun quack() {
        println("Quack! Quack!")
    }
}

fun main() {
    val duck = Duck()
    duck.run()  // Output: Running!
    duck.swim() // Output: Swimming!
    duck.quack() // Output: Quack! Quack!
}

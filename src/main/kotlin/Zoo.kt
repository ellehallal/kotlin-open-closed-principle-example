class Zoo constructor(private val animals: Array<String>) {

    fun feedAnimals(): Unit {
        for (animal in animals) {
            when (animal) {
                "giraffe" -> println("Feeding the giraffe acacia leaves and twigs.")
                "ferret" -> println("Feeding the ferret raw meat.")
                "penguin" -> println("Feeding the penguin krill.")
                else -> println("Feeding the $animal nothing.")
            }
        }
    }
}
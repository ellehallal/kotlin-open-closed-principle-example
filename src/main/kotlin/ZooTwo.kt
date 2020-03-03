class ZooTwo constructor(private val animals: Array<Animal>) {

    fun feedAnimals(): Unit {
        for (animal in animals) animal.feed()
    }
}

interface Animal {
    fun feed()
}

class Giraffe: Animal {
    override fun feed() {
        println("Feeding the giraffe acacia leaves and twigs.")
    }
}

class Ferret: Animal {
    override fun feed() {
        println("Feeding the ferret raw meat.")
    }
}

class Penguin: Animal {
    override fun feed() {
        println("Feeding the penguin krill.")
    }
}

class Elephant: Animal {
    override fun feed() {
        println("Feeding the elephant fresh fruit and tree bark.")
    }
}

fun main(args: Array<String>) {
    val gina = Giraffe()
    val frankie = Ferret()
    val paula = Penguin()
    val eve = Elephant()

    val myAnimals = arrayOf(gina, frankie, paula, eve)
    val myZoo = ZooTwo(myAnimals)

    myZoo.feedAnimals()
}

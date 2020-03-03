fun main(args: Array<String>) {
    val gina = Giraffe()
    val frankie = Ferret()
    val paula = Penguin()
    val eve = Elephant()

    val myAnimals = arrayOf(gina, frankie, paula, eve)
    val myZoo = ZooTwo(myAnimals)

//    val myAnimals = arrayOf("giraffe", "ferret", "penguin")
//    val myZoo = Zoo(myAnimals)

    myZoo.feedAnimals()
}

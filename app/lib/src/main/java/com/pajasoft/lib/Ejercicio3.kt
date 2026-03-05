package com.pajasoft.lib

open class Animal(val nombre : String, val edad : Int){
    open fun hacerSonido(){
        println("Sonido generico.")
    }
    fun describirse(){
        println("Soy $nombre y tendo $edad años.")
    }
}
class Perro(nombre:String, edad: Int): Animal(nombre,edad) {
    override fun hacerSonido() {
        println("Guau!")
    }
}
class Gato(nombre:String, edad: Int): Animal(nombre,edad) {
    override fun hacerSonido() {
        println("Miauuuu!")
    }
}

    class Vaca(nombre: String, edad: Int) : Animal(nombre, edad) {
        override fun hacerSonido() {
            println("MUUUUUUU!")
        }
    }

fun main(){
    val perro = Perro("Rex",3)
    val gato = Gato("Gordo",4)
    val vaca = Vaca("Moooollete",3)
    perro.describirse()
    perro.hacerSonido()
    gato.describirse()
    gato.hacerSonido()
    vaca.describirse()
    vaca.hacerSonido()

}



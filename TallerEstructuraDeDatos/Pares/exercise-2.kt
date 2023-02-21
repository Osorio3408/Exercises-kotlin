//Asignación y acceso a valores de pares en Kotlin

fun main() {
    // Se crea un par que contiene una cadena y un número
    val miPar = Pair("Hola", 123)
    
    // Se accede a los valores del par usando sus propiedades first y second
    val cadena = miPar.first
    val numero = miPar.second
    
    // Se imprimen los valores
    println("La cadena es: $cadena")
    println("El número es: $numero")
}
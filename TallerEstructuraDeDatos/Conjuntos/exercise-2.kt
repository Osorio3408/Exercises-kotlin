//Dados dos conjuntos, escribir una función que retorne un nuevo conjunto que contenga los elementos que están en el primer conjunto pero no en el segundo conjunto.

// Define la función que toma dos conjuntos de tipo String y devuelve la diferencia entre ellos
fun diferenciaConjuntos(conjunto1: Set<String>, conjunto2: Set<String>): Set<String> {
    return conjunto1.subtract(conjunto2)
}

fun main(){
    
    // Define dos conjuntos de tipo String
    val conjunto1 = setOf("manzana", "naranja", "kiwi", "banana")
    val conjunto2 = setOf("naranja", "banana"d)

    // Obtiene la diferencia entre los conjuntos utilizando la función anterior
    val diferencia = diferenciaConjuntos(conjunto1, conjunto2)

    // Imprime el resultado de la diferencia de los conjuntos
    println("Diferencia de conjuntos: $diferencia")

}
//Dada una lista de números enteros, escribir una función que filtre y retorne una lista con los números pares de la lista original.

// La función recibe una lista de números enteros y retorna una lista con los números pares.
fun filtrarPares(numeros: List<Int>): List<Int> {

    // La lista original es filtrada y solo se retornan los números pares.
    return numeros.filter { it % 2 == 0 } 
}

fun main(){
    val numeros = listOf(3, 7, 4, 8, 2, 1)

    // Se llama a la función filtrarPares con la lista de números.
    val numerosPares = filtrarPares(numeros) 

    // Se imprime en consola la lista de números pares.
    println("Números pares: $numerosPares") 
}

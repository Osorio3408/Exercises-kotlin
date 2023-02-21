//Dada una lista de pares (cada par contiene dos números), escribir una función que encuentre y retorne el par más grande en la lista (es decir, el par cuyos dos números suman el valor más grande). 


fun parMasGrande(lista: List<Pair<Int, Int>>): Pair<Int, Int>? {
    return lista.maxByOrNull { it.first + it.second }
}

fun main(){

    // Creamos una lista de pares de números enteros
    val lista = listOf(
        Pair(1, 2),
        Pair(3, 4),
        Pair(5, 6),
        Pair(7, 8),
        Pair(2, 3)
    )

    // Llamamos a la función parMasGrande y guardamos el resultado en la variable parMaximo
    val parMaximo = parMasGrande(lista)

    // Imprimimos el resultado en la consola
    println("Par más grande: $parMaximo")

}
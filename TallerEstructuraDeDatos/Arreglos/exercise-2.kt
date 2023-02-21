//Dado un arreglo de cadenas, escribir una función que lo ordene alfabéticamente y retorne el arreglo ordenado.

fun ordenarCadenas(cadenas: Array<String>): Array<String> {
    //la función sortedArray() se utiliza para ordenar el arreglo alfabéticamente.
    return cadenas.sortedArray()
}

fun main(){
    val palabras = arrayOf("manzana", "pera", "banana", "kiwi")
    val palabrasOrdenadas = ordenarCadenas(palabras)

    //La función contentToString() se utiliza para imprimir el arreglo ordenado como una cadena.
    println("Palabras ordenadas: ${palabrasOrdenadas.contentToString()}")
}
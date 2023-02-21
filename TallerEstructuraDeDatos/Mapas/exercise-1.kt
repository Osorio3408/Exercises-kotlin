// Dada una lista de elementos, escribir una función que retorne un mapa que cuente cuántas veces aparece cada elemento en la lista.

// Esta función recibe una lista de cadenas y devuelve un mapa que asocia a cada cadena su cantidad de ocurrencias en la lista.
fun contarElementos(lista: List<String>): Map<String, Int> {
    // La función groupingBy agrupa los elementos de la lista según una función que le pasamos, que en este caso es simplemente la identidad (cada elemento se agrupa a sí mismo).
    // Esto nos da un objeto Grouping que podemos usar para contar las ocurrencias de cada elemento con la función eachCount.
    return lista.groupingBy { it }.eachCount()
}

fun main(){
    // Creamos una lista con algunas cadenas repetidas.
    val lista = listOf("manzana", "banana", "naranja", "manzana", "kiwi", "banana", "manzana")
    // Contamos los elementos de la lista usando la función contarElementos que definimos anteriormente.
    val conteo = contarElementos(lista)
    // Imprimimos el resultado.
    println("Conteo de elementos: $conteo")
}
//Dada una lista de cadenas, escribir una función que elimine los elementos duplicados y retorne una nueva lista sin duplicados.

// Definición de la función eliminarDuplicados, que recibe una lista de cadenas y devuelve otra lista sin duplicados.
fun eliminarDuplicados(cadenas: List<String>): List<String> {
return cadenas.distinct()
}

// Función main que crea una lista de frutas con duplicados, llama a la función eliminarDuplicados y muestra el resultado.
fun main(){
val frutas = listOf("manzana", "naranja", "manzana", "kiwi", "naranja")
val frutasSinDuplicados = eliminarDuplicados(frutas)
println("Frutas sin duplicados: $frutasSinDuplicados")
}
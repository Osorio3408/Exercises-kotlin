//Dado un arreglo de calificaciones numéricas, escribir una función que calcule y retorne el promedio de dichas calificaciones.


// Esta función toma un arreglo de enteros como parámetro y calcula su promedio
fun calcularPromedio(calificaciones: IntArray): Double {
    var sumatoria = 0
    for (calificacion in calificaciones) {
        sumatoria += calificacion
    }
    return sumatoria.toDouble() / calificaciones.size
}


fun main() {

    // Creamos un arreglo de calificaciones
    val calificaciones = intArrayOf(8, 7, 9, 10, 8)

    // Llamamos a la función "calcularPromedio" pasándole como parámetro el arreglo de calificaciones
    val promedio = calcularPromedio(calificaciones)

    // Imprimimos el resultado en consola
    println("El promedio de calificaciones es: $promedio")
}
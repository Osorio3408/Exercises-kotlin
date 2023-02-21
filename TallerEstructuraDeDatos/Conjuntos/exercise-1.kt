//Dados dos conjuntos, escribir una función que retorne un nuevo conjunto que contenga la unión de ambos conjuntos.

// Función que recibe dos conjuntos de números enteros y retorna su unión
fun unirConjuntos(conjunto1: Set<Int>, conjunto2: Set<Int>): Set<Int> {
    
    // Utiliza la función "union" de la clase Set para obtener la unión de los conjuntos
    return conjunto1.union(conjunto2) 
}

// Función principal del programa
fun main() {
    // Crea un conjunto con los números 1, 2, 3 y 4
    val conjunto1 = setOf(1, 2, 3, 4) 

    // Crea otro conjunto con los números 3, 4, 5 y 6
    val conjunto2 = setOf(3, 4, 5, 6) 

    // Llama a la función "unirConjuntos" para obtener la unión de los conjuntos anteriores
    val union = unirConjuntos(conjunto1, conjunto2) 

    // Imprime en consola el resultado de la unión de los conjuntos
    println("Unión de conjuntos: $union") 
}
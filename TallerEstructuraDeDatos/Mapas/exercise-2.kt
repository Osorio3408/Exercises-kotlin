 //Acceder y recorrer un mapa en Kotlin.

// Se define un mapa de nombre y edad
val mapaEdades = mapOf(
    "Juan" to 25,
    "María" to 30,
    "Pedro" to 20,
    "Ana" to 28,
    "Luis" to 35
)

// Se accede a los valores del mapa usando las claves
println("La edad de Juan es ${mapaEdades["Juan"]} años")
println("La edad de Ana es ${mapaEdades["Ana"]} años")

// Se recorre el mapa usando un bucle for
for ((nombre, edad) in mapaEdades) {
    println("$nombre tiene $edad años")
}
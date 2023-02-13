//Algoritmo para saber si el usuario es 
//menor de edad con Condicionales simples

fun main(){
    //Se imprime en consola que ingrese la edad
    print("Ingrese la edad del usuario: ")

    //Se guarda el dato en la variable edad usando readLine y se convierte en Int(entero)
    var edad = readLine()!!.toInt();

    //Se hace la condicion para saber si es menor de edad
    if(edad < 18){
        //imprime que es menor de edad
        println("El usuario es menor de edad!")
    }

    println("La edad del usuario es: $edad")

}
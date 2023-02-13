//Algoritmo que pida el numero de personas a saludar y por
//cada persona solicitar el nombre para saludarlos usando el ciclo do-while

fun main() {

    // Inicializa el contador en 1
    var contador:Int = 1;

    // Pide al usuario que ingrese la cantidad de personas que desea saludar
    print("Ingrese el numero de personas a saludar: ")
    var cantidad_p = readLine()!!.toInt();

    // Realiza un bucle "do-while" para saludar a cada persona
    do{

        // Pide al usuario que ingrese el nombre de la persona actual
        print("Ingrese el nombre de la persona $contador: ")
        var nombre = readLine()!!.toString();

        // Muestra un mensaje de bienvenida con el nombre de la persona actual
        println("Hola $nombre, bienvenid@!")

        // Incrementa el contador
        contador++;

        
    }while(contador <= cantidad_p)
    // Continúa el bucle hasta que se hayan saludado a todas las personas

}
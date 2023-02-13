//Algoritmo que pide un numero para ponerlo de rango
//apartir de ese numero mostraremos los numeros pares que hay 
//usando el ciclo while

fun main(){

    //se declara una variable tipo var con nombre contador y tipo int
    // y tambien se le asigna el valor 1
    var contador:Int = 1;

    //se pide por consola que ingrese un numero y se guarda en la variable numero
    //sin permitir valores nuloss
    print("Ingrese el numero: ")
    var numero = readLine()!!.toInt();

    //se ejecuta el ciclo while hasta que la variable contador tenga
    //el mismo valor de la variable numero
    while(contador <= numero){

        //se hace la condicion para saber si el dato de 
        //la variable contador es par
        if(contador % 2 == 0){
            println(contador)
        }

        //se autoincrementa el valor de la variable contador
        contador++;
    }


}
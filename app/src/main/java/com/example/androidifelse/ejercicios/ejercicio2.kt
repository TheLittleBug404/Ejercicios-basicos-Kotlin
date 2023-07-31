package com.example.androidifelse.ejercicios
/**
 * Las entradas de cine suelen tener un precio diferente según la edad de los espectadores.

En el código inicial que se proporciona en el siguiente fragmento de código, escribe un programa que calcule los precios de estas
entradas basados en la edad:

Un precio de entrada infantil de USD 15 para personas de 12 años o menos.
Un precio de entrada estándar de USD 30 para personas de entre 13 y 60 años. Los lunes, un precio estándar con descuento de USD 25
para el mismo grupo etario
Un precio para adultos mayores de USD 20 para personas de 61 años o más (asumimos que la edad máxima de un espectador es de 100 años)
Un valor de -1 para indicar que el precio no es válido cuando un usuario ingresa una edad fuera de las especificaciones

RESULTADO:
- The movie ticket price for a person aged 5 is $15.
- The movie ticket price for a person aged 28 is $25.
- The movie ticket price for a person aged 87 is $20.
 */
fun precioEntradas(edad:Int, dia:String):Int {
    if(edad>100 && edad <0)
        return  -1
    if(edad<=12)
        return 15
    if(edad >=13 && edad <=60 && dia=="Lunes")
        return 25
    if(edad >=13 && edad <=60)
        return 30
    if(edad >=61)
        return 20
    return 0
}
fun main() {
    println("Introdusca la edad del sujeto: ")
    var edad:Int = readLine()!!.toInt()
    println("Introdusca el dia de la semana")
    var dia:String = readLine()!!
    println("The movie ticket price for a person aged $edad is $"+precioEntradas(edad,dia))
}
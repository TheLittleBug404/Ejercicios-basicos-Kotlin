package com.example.androidifelse.ejercicios
/**
 * En el mundo, se usan tres escalas de temperatura principales: Celsius, Fahrenheit y Kelvin.

En el código inicial que se proporciona en el siguiente fragmento de código, escribe un programa
que convierta una temperatura de una escala a otra con estas fórmulas:

De grados Celsius a Fahrenheit: °F = 9/5 (°C) + 32
Kelvin a Celsius: °C = K - 273.15
De Fahrenheit a Kelvin: K = 5/9 (°F - 32) + 273.15
Ten en cuenta que el método String.format("%.2f", /* measurement */ ) se
usa para convertir un número en un tipo String con 2 decimales.
 */
fun convierte(n:Int):String{
    var num:Double
    return when(n){
        1-> {
            //Celsius a Fahrenheit
            println("Introdusca los Celcius para que se vuelvan Fahrenheit")
            var a:Double = readLine()!!.toDouble()
            num = (((9*a.toDouble())/5) + 32)
            String.format("%.2f",num)
        }
        2->{
            //kevin a celsius
            println("Introdusca los Kelvin para que se vuelvan Celcius")
            var a:Double = readLine()!!.toDouble()
            num =  (a-273.15)
            String.format("%.2f",num)
        }
        3-> {
            // de fahrenheit a kelvin
            println("Introdusca los fahrenheit para que se vuelvan Kelvin")
            var a:Double = readLine()!!.toDouble()
            num = ((5*(a-32))/9)+273.15
            String.format("%.2f",num)
        }
        else -> "Por favor introdusca solo los numero 1,2,3 "
    }
}
fun main(){
    println("Introdusca un numero para convertir")
    println("1.-  De Celcius a Fahrenheit")
    println("2.- De Kelvin a Celcius")
    println("3.- De Fahrenheit a Kelvin")
    var n:Int = readLine()!!.toInt()
    println("Resultado: ${convierte(n)}")
}

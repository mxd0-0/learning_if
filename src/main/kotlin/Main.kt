package org.example

fun main() {
    val trraficLightColor = "Black"
    if (trraficLightColor == "Red") {
        println("Stop")
    } else if (trraficLightColor == "yellow") {
        println("Slow")

    }else if (trraficLightColor == "Green"){
        println("GO")
    } else {
        println("Invalid traffic-light color")
    }
}
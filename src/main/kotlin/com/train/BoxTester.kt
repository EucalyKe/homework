package com.box.kotlin

import java.util.*

fun main(args: Array<String>) {
    val box3 = Box3(23.0f, 14.0f, 13.0f)
    val box5 = Box5(39.5f, 27.5f, 23.0f)

    var scanner = Scanner(System.`in`)
    println("Please enter objcet's length:")
    var length = scanner.nextInt().toFloat()
    println("Please enter objcet's width:")
    var width = scanner.nextInt().toFloat()
    println("Please enter objcet's height:")
    var height = scanner.nextInt().toFloat()
    var boxTester = BoxTester(length, width, height)
    boxTester.validate()
}

class Box3(var length : Float, var width : Float, var height : Float) {
    companion object {
        var length = 0
        var width = 0
        var height = 0
    }
}

class Box5(var length : Float, var width : Float, var height : Float) {
    companion object {
        var length = 0
        var width = 0
        var height = 0
    }
}

class BoxTester(var length : Float, var width : Float, var height : Float) {
    fun validate() {
        if((length > Box3.length) || (width > Box3.width) || (height > Box3.height))
            println("Box3")
        else if((length > Box5.length) || (width > Box5.width) || (height > Box5.height))
            println("Box5")
        else
            println("No suitable box.")
    }
}


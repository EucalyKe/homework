package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets:")
    var totaltickets = scanner.nextInt()
    print("How many round-trip tickets:")
    var roundtrip = scanner.nextInt()
    val t = TicketKotlin(totaltickets, roundtrip)
    t.print()
}

class TicketKotlin(var totalticket : Int, var roundtrip : Int) {
    fun print() {
        var total = ((totalticket - roundtrip) * 1000) + roundtrip * 1800
        println("Total tickets:$totalticket")
        println("Round-trip:$roundtrip")
        println("Total:$total")
    }
}
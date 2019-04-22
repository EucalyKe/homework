package com.train

import java.util.*

fun main(args: Array<String>) {
    var totaltickets = 0
    var roundtrip = 0
    while ((totaltickets != -1) && (roundtrip != -1)) {
        //val scanner = Scanner(System.`in`)
        print("Please enter number of tickets:") //輸入購票張數
        totaltickets = readLine()!!.toInt()
        if(totaltickets != -1) { //判斷是否輸入-1,如是則結束系統
            print("How many round-trip tickets:")
            roundtrip = readLine()!!.toInt()

            if(roundtrip != -1) { //判斷是否輸入-1,如是則結束系統
                if(totaltickets >= roundtrip) {
                    val t = TicketKotlin(totaltickets, roundtrip)
                    t.print()
                } else {
                    println("Please enter again.");
                }
            } else println("The system is end.")

        } else println("The system is end.")

    }

}

class TicketKotlin(var totalticket : Int, var roundtrip : Int) {
    fun print() {
        var total = ((totalticket - roundtrip) * 1000) + roundtrip * 1800
        println("Total tickets:$totalticket")
        println("Round-trip:$roundtrip")
        println("Total:$total")
    }
}
import java.awt.SystemColor
import java.awt.SystemColor.text
import java.util.*
import kotlin.CharSequence
import kotlin.CharSequence as CharSequence1

fun main(args: Array<String>) {
    val addera = 0

    println("Vad vill du göra?")
    println("1. Addera två tal")
    println("2. Räkna bokstäver i en sträng")
    println("3. Spegelvänd sträng")
    println("4. Summera alla tal i en sträng")

    val input = readLine()

 if (input == "1") {
     val read = Scanner(System.`in`)

     println("Skriv in första talet")
     val firstNum = read.nextInt()

     println("Skriv in andra talet")
     val secondNum = read.nextInt()

     val sum = firstNum + secondNum
     println("sum = $sum")
}
    if (input == "2") {
        val scanner = Scanner(System.`in`)
        print("Ange ordet du vill leta i: ")
        val str = scanner.nextLine()
        
        print("Ange bokstaven du vill söka efter: ")
        val c = scanner.next()[0]

        var frequency=0
        //Count Frequency
        for (i in str.indices){
            if(c == str[i]){
                frequency++
            }
        }

        //Print Frequency of Character
        println("Det finns $frequency $c i meningen $str")


        }
        if(input == "3") {
        val scanner: Scanner = Scanner(System.`in`)

    print("Skriv in en sträng: ")
    var str = scanner.nextLine()
    var reverse = str.reversed()

    print(reverse)
}

}

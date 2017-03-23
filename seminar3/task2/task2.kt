package seminar3.task2

/**
 * Created by fedor on 23.03.17.
 */

fun main(args: Array<String>) {
    println("Ваша строка:")

    // read string
    val s: String = readLine()!!

    // string check
    if (StringBuilder(s).reverse().toString().equals(s))
        println("да")
    else println("нет")
}
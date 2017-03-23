package seminar3.task4

/**
 * Created by fedor on 23.03.17.
 */

fun TryParseInt(varName : String) : Int {

    while (true) {
        try {

            // get input
            print("Введите $varName: ")
            val result = readLine()!!.toInt()

            // try to convert
            if (result > -1)
                return result
            else
                throw Exception();
        } catch (e: Exception) {
            println("Неверный ввод!")
        }
    }
}
fun main(args: Array<String>) {

    println("Ваша строка:")
    val s: String = readLine()!!

    val a: Int  = TryParseInt("a")
    val b: Int = TryParseInt("b")

    // message output
    if (a >= b)
        throw Exception()
    println(s.substring(a,b))
}


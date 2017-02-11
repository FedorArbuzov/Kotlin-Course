package seminar1.task2


/**
 * Created by fedor on 05.02.17.
 */
fun TryParseInt(s: String): Int?{
    try {
        return s.toInt()
    }
    catch (e: NumberFormatException){
        return null
    }
}

fun TryParseDouble(s: String): Double?{
    try {
        return s.toDouble()
    }
    catch (e: NumberFormatException){
        return null
    }
}

fun main(args: Array<String>){
    //println(TryParseInt("12"))
    //println(TryParseInt("qwe1"))
    //println(TryParseInt("12.3"))

    var num : Int?
    do {
        println("Введите число элементов")
        val numS = readLine()!!
        num = TryParseInt(numS)
    }while (TryParseInt(numS) == null)
    num = num!!
    var arr = DoubleArray(num)


    for(i: Int in 0..num-1){
        var el: Double
        do {
            println("Введите $i элемент")
            var numS = readLine()!!
            el = TryParseDouble(numS)!!
        }while (TryParseDouble(numS) == null)
        arr[i] = el
    }

    // до сортировки
    println("до сортировки")
    for(i: Int in 0..num-1){
        println("$i элемент равен ${arr[i]}")
    }

    // сортировка
    var swapped = true
    var j = 0
    while (swapped) {
        swapped = false
        j++
        for (i in 0..num - j - 1) {
            if (arr[i] > arr[i + 1]) {
                var tmp = arr[i]
                arr[i] = arr[i + 1]
                arr[i + 1] = tmp
                swapped = true
            }
        }
    }

    // после сортировки
    println("после сортировки")
    for(i: Int in 0..num-1){
        println("$i элемент равен ${arr[i]}")
    }


}

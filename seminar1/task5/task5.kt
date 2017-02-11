package seminar1.task5

import java.util.*

/**
 * Created by fedor on 11.02.17.
 */

fun main(args: Array<String>){
    var s = readLine()!!.toLowerCase()
    var arr = s.split(' ')
    var map: HashMap<Char, MutableList<String>>  = hashMapOf()
    for(i in "mnbvcxzlkjhgfdsapoiuytrewq") {
        map[i] = mutableListOf<String>()
    }
    for(i in arr){
        map[i[0]]!!.add(i)
    }
    println(map)



}
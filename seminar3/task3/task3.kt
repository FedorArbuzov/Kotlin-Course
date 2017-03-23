package seminar3.task3

/**
 * Created by fedor on 23.03.17.
 */

fun main(args: Array<String>) {

    // const list and set
    val list: List<Int> = listOf(1, 2, 3, 2, 2, 4, 6)
    val set: Set<Int> = setOf(1, 2, 4)
    var res = Array(set.size) { IntArray(list.size) }


    // init matrix
    for (i in 0..res.size - 1)
        for (j in 0..res.size - 1)
            res[i][j] = -1
    set.elementAt(1)


    // add element in res
    for (i in 0..set.size - 1) {
        for (j in 0..list.size - 1)
            if (list[j] == set.elementAt(i))
                res[i][j] = j
    }


    // output numbers
    res.forEach {
        it.filter { it > 0 }.forEach { print("$it ") }
        print("\n")
    }
}

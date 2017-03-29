package task1

/**
 * Created by fedor on 29.03.17.
 */

interface HW {
    fun print()
}

open class class1 : HW {
    override fun print() {
        println("Hello, FIRST CLASS")
    }
}

open class class2 : HW {
    override fun print() {
        println("Hello, SECOND CLASS")
    }
}

class class3 : HW {
    override fun print() {
        println("Hello, THIRD CLASS")
    }
}

fun main(args: Array<String>) {

    var helloWorld: HW

    helloWorld = class1()
    helloWorld.print()

    helloWorld = class2()
    helloWorld.print()

    helloWorld = class3()
    helloWorld.print()

}
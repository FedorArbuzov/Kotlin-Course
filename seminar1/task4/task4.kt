package seminar1.task4

/**
 * Created by fedor on 10.02.17.
 */
fun countPM(numbers: MutableList<Double>, sym: MutableList<Char>): Double{
    var result: Double = numbers[0]
    for(i in 1..numbers.size-1){
        if(sym[i-1] == '+'){
            result += numbers[i]
        }
        else{
            result -= numbers[i]
        }
    }
    return result
}

fun countMD(numbersNew: MutableList<Double>, symNew: MutableList<Char>): Double {


    while('*' in symNew || '/' in symNew){

        var mIndex = symNew.indexOf('*')
        var dIndex = symNew.indexOf('/')

        if(mIndex != -1){
            numbersNew[mIndex] *= numbersNew[mIndex + 1]
            numbersNew.removeAt(mIndex + 1)
            symNew.removeAt(mIndex)
            continue
        }

        if(dIndex != -1){
            numbersNew[dIndex] /= numbersNew[dIndex + 1]
            numbersNew.removeAt(dIndex + 1)
            symNew.removeAt(dIndex)
            continue
        }
    }
    return countPM(numbersNew, symNew)
}

fun countLR(numbers: MutableList<Double>, sym: MutableList<Char>): Double{
    while('(' in sym){
        var lPos = 0
        var rPos = 0

        for(i in 0..sym.size-1){
            if(sym[i] == '('){
                lPos = i
                }
            if(sym[i] == ')'){
                rPos = i


                var numbersNew: MutableList<Double> = mutableListOf()
                var symNew: MutableList<Char> = mutableListOf()
                for(i in lPos..rPos-1){
                    println(numbers)
                    println(sym)
                    numbersNew.add(numbers[i])
                }
                for(i in lPos+1..rPos-1){
                    symNew.add(sym[i])
                }


                for(i in 0..rPos-lPos-2){
                    numbers.removeAt(lPos)
                }
                for(i in 0..rPos-lPos){
                    sym.removeAt(lPos)
                }

                numbers[lPos] = countMD(numbersNew, symNew)
                break
            }
        }

    }
    println(numbers)
    println(sym)
    return countMD(numbers, sym)
}

fun main(args: Array<String>){
    var s = readLine()!!

    var sNew = ""
    for(i in 0..s.length-1){
        if(s[i] != ' ')
            sNew += s[i]
    }
    s = sNew

    println(s)
    var numbers = s.split('+', '-', '*', '/', '(', ')')
    var sym: MutableList<Char> = mutableListOf()
    for(i in s){
        if(i in "+-*/()"){
            sym.add(i)
        }
    }

    var numbersNew: MutableList<Double> = mutableListOf()
    numbers.map { if(it != ""){numbersNew.add(it.toDouble())} }

    print(countLR(numbersNew, sym))
}
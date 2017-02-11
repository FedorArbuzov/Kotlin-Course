package seminar1.task3

/**
 * Created by fedor on 10.02.17.
 */
fun main(args: Array<String>){
    var s = readLine()!!
    var sNew = ""
    var  count = 1
    var ch = s[0]
    for(i in 1..s.length-1){
        if(s[i] == ch){
            count++
        }
        else{
            sNew += ch + count.toString()
            ch = s[i]
            count = 1
        }
    }
    sNew += ch + count.toString()
    print(sNew)
}
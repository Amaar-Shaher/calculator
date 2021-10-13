import javax.print.DocFlavor

fun main(args: Array<String>) {
var number1 = 0
   var number2 = 0
    var operation: Char = '+'
    println("please enter the 1st number:")
    number1 = readLine()!!.toInt()
    println("please enter the 2nd number:")
    number2 = readLine()!!.toInt()
    println("please enter the operation like + - * / :")
    operation = readLine()!!.single()

   when (operation){
       '+'-> add(number1, number2)
       '-'-> sub(number1, number2)
       '*'-> mult(number1, number2)
       '/'-> div(number1, number2)
   }
4

}

fun add(num1 : Int, num2 : Int){
    println("$num1 + $num2 = ${num1 + num2}")

}
fun sub(num1 : Int, num2 : Int) {
    println("$num1 - $num2 = ${num1 - num2}")
}
fun mult(num1 : Int, num2 : Int){
    println("$num1 * $num2 = ${num1 * num2}")
    }
fun div(num1 : Int, num2 : Int) {
    println("$num1 / $num2 = ${num1 / num2}")
}



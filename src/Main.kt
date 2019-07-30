fun main() {
    val num1 = RationalNumber(6, 5)
    val num2 = RationalNumber(3, 7)
    var sum = add(num1, num2)
    println(sum)
    val str = toDouble(sum).toString()
    println(str)

}
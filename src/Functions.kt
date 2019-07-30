fun toDouble(num: RationalNumber): Double = num.numerator / num.denominator.toDouble()

fun add(num1: RationalNumber, num2: RationalNumber): RationalNumber {
    val newNumerator = (num1.numerator * num2.denominator) + (num2.numerator * num1.denominator)
    val newDenominator = num1.denominator * num2.denominator
    return RationalNumber(newNumerator, newDenominator)
}

fun main(args: Array<String>) { //TODO: Take into account numbers before the fraction, eg. y=6(1/4)^x +3
    println("GrowthNDecay: does stuff on weird y = mx + b memes")
    val calc = Calc()
    while(true) {
        print("Enter numerator: ")
        val numerator: Double = readLine()?.toDouble() ?: 0.0
        print("Enter denominator(if denominator isn't provided, enter 1): ")
        val denominator: Double = readLine()?.toDouble() ?: 1.0
        print("Enter provided y-intercept(if none provided, enter 1): ")
        val yint: Double = readLine()?.toDouble() ?: 0.0
        print("Enter exponent(if none provided, enter 0): ")
        val expo: Double = readLine()?.toDouble() ?: 0.0
        println("Base: $numerator / $denominator")
        println("Growth? " + calc.isGrowth(numerator, denominator))
        println("Above or below? " + calc.above(numerator))
        println("Y-intercept: " + calc.yint(numerator, denominator, yint, expo))
    }
}
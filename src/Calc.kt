class Calc {
    fun isGrowth(wan: Double, tsuu: Double): Boolean {
        return (wan / tsuu) >= 1.0
    }
    fun above(num: Double): String {
        return if(num > 0.0) "above" else "below"
    }
    fun yint(num: Double, wan: Double, tsuu: Double, intercept: Double, expo: Double): Double {
        //TODO: Implement!
        return 0.0
    }
}

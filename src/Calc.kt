class Calc {
    fun isGrowth(wan: Double, tsuu: Double): Boolean {
        return (wan / tsuu) >= 1.0
    }
    fun above(wan: Double): String {
        return if(wan > 0.0) "above" else "below"
    }
    fun yint(wan: Double, tsuu: Double, intercept: Double, expo: Double): Double {
        //TODO: Implement!
        return 0.0
    }
}
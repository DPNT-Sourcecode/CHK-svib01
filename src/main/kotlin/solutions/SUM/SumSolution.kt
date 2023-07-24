package solutions.SUM

object SumSolution {
    fun sum(x: Int, y: Int): Int {
        if (x < 0 || x > 100 || y < 0 || y > 100) {
            throw IllegalArgumentException("Arguments need to be between 0-100")
        }
        return x + y
    }
}


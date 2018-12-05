package com.igorwojda.codingpuzzle.fibonacci.classic

//iterative solution
private object FibonacciSolution1 {
    private fun fibonacci(n: Int): Int {
        if (n < 2) {
            return n
        }

        var first = 0
        var second = 1
        var current = 0

        (2..n).forEach {
            current = first + second
            first = second
            second = current
        }

        return current
    }
}

//iterative solution with temporary list (not efficient)
private object FibonacciSolution2 {
    private fun fibonacci(n: Int): Int {
        val list = mutableListOf(0, 1)

        for (it in list.size..n) {
            list.add(list.takeLast(2).sum())
        }

        return list[n]
    }
}

//recursive solution
private object FibonacciSolution3 {
    private fun fibonacci(n: Int): Int {
        return when (n) {
            0 -> 0
            1 -> 1
            else -> fibonacci(n - 1) + fibonacci(n - 2)
        }
    }
}

//recursive solution
private object FibonacciSolution4 {
    private fun fibonacci(n: Int): Int {
        if (n < 2) {
            return n
        }

        return fibonacci(n - 1) + fibonacci(n - 2)
    }
}

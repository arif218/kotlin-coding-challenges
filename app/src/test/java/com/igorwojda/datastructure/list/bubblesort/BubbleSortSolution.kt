package com.igorwojda.datastructure.list.bubblesort

private object BubbleSortSolution {
    private fun bubbleSort(list: List<Int>): List<Number> {
        val sorted = list.toMutableList()

        sorted.forEachIndexed { i, _ ->
            var swapped = false
            (0 until (sorted.size - i - 1)).forEach { j ->
                val element = sorted[j]
                val nextElement = sorted[j + 1]

                if (element > nextElement) {
                    sorted[j] = nextElement
                    sorted[j + 1] = element
                    swapped = true
                }
            }

            if (!swapped) {
                return sorted
            }
        }

        return sorted
    }
}

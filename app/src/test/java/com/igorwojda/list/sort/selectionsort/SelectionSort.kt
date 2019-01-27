package com.igorwojda.list.sort.selectionsort

import org.amshove.kluent.shouldEqual
import org.junit.Test

private fun selectionSort(list: List<Int>): List<Number> {
    return list
}

class SelectionSortTest {
    @Test
    fun `selection sort 5, 1, 4, 2`() {
        selectionSort(listOf(5, 1, 4, 2)) shouldEqual listOf(1, 2, 3, 4)
    }

    @Test
    fun `selection sort 17, 4, 12, 19, 80, 75, 16`() {
        selectionSort(listOf(17, 4, 12, 19, 80, 75, 16)) shouldEqual listOf(4, 12, 16, 17, 19, 75, 80)
    }
}

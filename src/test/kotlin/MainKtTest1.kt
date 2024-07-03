import org.junit.Test

import org.junit.Assert.*


class MainKtTest {


    @Test
    fun comissionCalcMir() {
        val card = "Мир"
        val previosTransfer = 1000
        val transfer = 11000


        val result = comissionCalc(card, previosTransfer, transfer)

        assertEquals(82, result)
    }

    @Test
    fun comissionCalcVisa() {
        val card = "Visa"
        val previosTransfer = 75_000
        val transfer = 2000


        val result = comissionCalc(card, previosTransfer, transfer)

        assertEquals(35, result)
    }

    @Test
    fun comissionCalcMasterCard() {
        val card = "MasterCard"
        val previosTransfer = 10_000
        val transfer = 1000


        val result = comissionCalc(card, previosTransfer, transfer)

        assertEquals(0, result)
    }

    @Test
    fun comissionCalcMaestro() {
        val card = "Maestro"
        val previosTransfer = 7500
        val transfer = 65_000


        val result = comissionCalc(card, previosTransfer, transfer)

        assertEquals(0, result)
    }

    @Test
    fun comissionCalcVK() {
        val card = "VK Pay"
        val previosTransfer = 1000
        val transfer = 10_000


        val result = comissionCalc(card, previosTransfer, transfer)

        assertEquals(0, result)
    }

    @Test
    fun comissionCalcLimit() {
        val card = "VK Pay"
        val previosTransfer = 550_000
        val transfer = 160_000


        val result = comissionCalc(card, previosTransfer, transfer)

        assertEquals(-1, result)
    }


    @Test
    fun comissionCalcMaestroMin() {
        val card = "Maestro"
        val previosTransfer = 0
        val transfer = 150


        val result = comissionCalc(card, previosTransfer, transfer)

        assertEquals(20, result)
    }

    @Test
    fun comissionCalcMaestroMax() {
        val card = "Maestro"
        val previosTransfer = 70_000
        val transfer = 7000


        val result = comissionCalc(card, previosTransfer, transfer)

        assertEquals(32, result)
    }

    @Test
    fun comissionCalcMasterCardMin() {
        val card = "MasterCard"
        val previosTransfer = 0
        val transfer = 100


        val result = comissionCalc(card, previosTransfer, transfer)

        assertEquals(20, result)
    }

    @Test
    fun comissionCalcMasterCardMax() {
        val card = "MasterCard"
        val previosTransfer = 80_000
        val transfer = 1000


        val result = comissionCalc(card, previosTransfer, transfer)

        assertEquals(56, result)
    }
}





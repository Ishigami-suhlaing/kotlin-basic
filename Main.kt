package com.example.courseraadvancedkotlin

data class OrderItem(val food:String, val price:Double)

class TaxCalculator{
    companion object {

        private const val salesTaxPercentage:Double = 0.15
        private var orderAmount:Double = 0.00

        fun getTaxAmountForOrderItems(orderItemList:List<OrderItem>): Double{
            var totalTaxAmount: Double = 0.00
            val orderAmount = orderItemList.sumOf { it.price }

            totalTaxAmount = orderAmount * salesTaxPercentage
            return totalTaxAmount
        }
    }
}

fun main(){
    val orderItemList:List<OrderItem> = listOf(
        OrderItem("Burger", 8.00),
        OrderItem("Fries", 4.00),
        OrderItem("Soda",2.00),
        OrderItem("Ice Cream", 4.00)
    )

    val totalTaxAmount = TaxCalculator.getTaxAmountForOrderItems(orderItemList)

    println(totalTaxAmount)
}

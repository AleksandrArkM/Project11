fun main() {
}

fun comissionPay(cardType: String, summTrans: Int): Int {
    val summTrans = summTrans
    val summPrevTrans = 0

    return when (cardType) {
        "Mastercard", "Maestro" -> if ((summTrans > 300) && ((summTrans+summPrevTrans) < 75000)) 0 else (summTrans*100/1000*6)+20*100
        "Visa", "Мир" -> if((summTrans/10000*75) > 35) summTrans*100/10000*75 else 35
        "VK Pay" -> 0
        else -> 0
    }
}
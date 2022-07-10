import org.junit.Assert.assertEquals
import org.junit.Test

class MainKtTest {
    @Test
    fun comissionPay_MastercardTestBig(){
        val card = "Mastercard"
        val comission = 602000
        val summTrans = 1000000
        val comissionPaycard = comissionPay(card, summTrans)
        assertEquals(comission, comissionPaycard)
    }

    @Test
    fun comissionPay_MaestrocardTestBig(){
        val card = "Maestro"
        val comission = 602000
        val summTrans = 1000000
        val comissionPaycard = comissionPay(card, summTrans)
        assertEquals(comission, comissionPaycard)
    }
    @Test
    fun comissionPay_MastercardTestSmall(){
        val card = "Mastercard"
        val comission = 100
        val summTrans = 400
        val comissionPaycard = comissionPay(card, summTrans)
        assertEquals(comission, comissionPaycard)
    }
    @Test
    fun comissionPay_MastercardTestVerySmall(){
        val card = "Mastercard"
        val comission = 2060
        val summTrans = 100
        val comissionPaycard = comissionPay(card, summTrans)
        assertEquals(comission, comissionPaycard)
    }
    @Test
    fun comissionPay_MaestrocardTestSmall(){
        val card = "Maestro"
        val comission = 0
        val summTrans = 400
        val comissionPaycard = comissionPay(card, summTrans)
        assertEquals(comission, comissionPaycard)
    }
    @Test
    fun comissionPay_MaestrocardTestVerySmall(){
        val card = "Maestro"
        val comission = 2060
        val summTrans = 100
        val comissionPaycard = comissionPay(card, summTrans)
        assertEquals(comission, comissionPaycard)
    }
    @Test
    fun comissionPay_VKPaycardTest(){
        val card = "VK Pay"
        val comission = 0
        val summTrans = 100
        val comissionPaycard = comissionPay(card, summTrans)
        assertEquals(comission, comissionPaycard)
    }
    @Test
    fun comissionPay_MircardTestSmall(){
        val card = "Мир"
        val comission = 35
        val summTrans = 100
        val summPrevTrans = 0
        val comissionPaycard = comissionPay(card, summTrans)
        assertEquals(comission, comissionPaycard)
    }
    @Test
    fun comissionPay_MircardTestBig(){
        val card = "Мир"
        val comission = 750000
        val summTrans = 1000000
        val summPrevTrans = 0
        val comissionPaycard = comissionPay(card, summTrans)
        assertEquals(comission, comissionPaycard)
    }
    @Test
    fun comissionPay_VisacardTestBig(){
        val card = "Visa"
        val comission = 750000
        val summTrans = 1000000
        val summPrevTrans = 0
        val comissionPaycard = comissionPay(card, summTrans)
        assertEquals(comission, comissionPaycard)
    }
    fun comissionPay_VisacardTestSmall(){
        val card = "Visa"
        val comission = 35
        val summTrans = 10000000
        val summPrevTrans = 0
        val comissionPaycard = comissionPay(card, summTrans)
        assertEquals(comission, comissionPaycard)
    }
    @Test
    fun comissionPay_OtherCardTest(){
        val card = "other"
        val comission = 0
        val summTrans = 100
        val comissionPaycard = comissionPay(card, summTrans)
        assertEquals(comission, comissionPaycard)
    }
}
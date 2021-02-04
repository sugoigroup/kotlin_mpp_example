package com.sugoijapaneseschool.mykotlinmpp.shared

class ExchangeMoneyCalcurator(val baseDollor: Double, val country: String) {
    fun calc(): Double {
        val rate: Double = when (country) {
            "YEN" -> 0.91
            "WON" -> 0.95
            else -> 1.0
        }
        return baseDollor * rate
    }

}
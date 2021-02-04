package com.sugoijapaneseschool.mykotlinmpp.shared

actual class ExchangeMoney actual constructor(val baseDollor: Double) {
    actual fun toYen(): Double {
        return ExchangeMoneyCalcurator(baseDollor, "YEN").calc()
    }
    actual fun toWon(): Double {
        return ExchangeMoneyCalcurator(baseDollor, "WON").calc()
    }
}

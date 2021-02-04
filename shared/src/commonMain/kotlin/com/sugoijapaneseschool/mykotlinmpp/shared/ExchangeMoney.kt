package com.sugoijapaneseschool.mykotlinmpp.shared

expect class ExchangeMoney(baseDollor: Double) {
    fun toYen(): Double
    fun toWon(): Double
}
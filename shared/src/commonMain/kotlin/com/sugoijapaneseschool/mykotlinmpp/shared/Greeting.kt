package com.sugoijapaneseschool.mykotlinmpp.shared


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}

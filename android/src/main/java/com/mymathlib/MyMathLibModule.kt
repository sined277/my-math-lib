package com.mymathlib

import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class MyMathLibModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    @ReactMethod
    fun add(a: Double, b: Double, callback: Callback) {
        val result = a + b
        callback.invoke(result)
    }

    @ReactMethod
    fun subtract(a: Double, b: Double, callback: Callback) {
        val result = a - b
        callback.invoke(result)
    }

    @ReactMethod
    fun multiply(a: Double, b: Double, callback: Callback) {
        val result = a * b
        callback.invoke(result)
    }

    @ReactMethod
    fun divide(a: Double, b: Double, callback: Callback) {
        if (b == 0.0) {
            callback.invoke("Error", "Division by zero is not allowed")
        } else {
            val result = a / b
            callback.invoke(result)
        }
    }

    override fun getName(): String {
        return "MyMathLib"
    }
}

package com.mymathlib

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise

class MathModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    override fun getName(): String {
        return "MathModule"
    }

    @ReactMethod
    fun add(a: Double, b: Double, promise: Promise) {
        promise.resolve(a + b)
    }

    @ReactMethod
    fun subtract(a: Double, b: Double, promise: Promise) {
        promise.resolve(a - b)
    }

    @ReactMethod
    fun multiply(a: Double, b: Double, promise: Promise) {
        promise.resolve(a * b)
    }

    @ReactMethod
    fun divide(a: Double, b: Double, promise: Promise) {
        if (b == 0.0) {
            promise.reject("DIVIDE_BY_ZERO", "Cannot divide by zero")
        } else {
            promise.resolve(a / b)
        }
    }
}

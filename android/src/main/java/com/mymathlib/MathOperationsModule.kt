package com.mymathlib

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Callback

class MathOperationsModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

  override fun getName(): String {
    return "MathOperations"
  }

  @ReactMethod
  fun add(a: Double, b: Double, callback: Callback) {
    callback.invoke(a + b)
  }

  @ReactMethod
  fun subtract(a: Double, b: Double, callback: Callback) {
    callback.invoke(a - b)
  }

  @ReactMethod
  fun multiply(a: Double, b: Double, callback: Callback) {
    callback.invoke(a * b)
  }

  @ReactMethod
  fun divide(a: Double, b: Double, callback: Callback) {
    if (b == 0.0) {
      callback.invoke("Error: Division by zero")
    } else {
      callback.invoke(a / b)
    }
  }
}

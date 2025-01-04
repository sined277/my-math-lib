package com.mymathlib

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactPackage
import com.facebook.react.uimanager.ViewManager
import com.facebook.react.bridge.ReactModuleInfoProvider
import com.facebook.react.bridge.ReactModuleInfo
import com.facebook.react.bridge.ReactModuleProvider

class MathPackage : ReactPackage {
    override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
        return listOf(MathModule(reactContext))
    }

    override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
        return emptyList()
    }
}

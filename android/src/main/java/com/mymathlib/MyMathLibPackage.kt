package com.mymathlib

import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfo
import com.facebook.react.module.model.ReactModuleInfoProvider
import java.util.HashMap

class MyMathLibPackage : BaseReactPackage() {

  companion object {
    const val MODULE_NAME = "MyMathLib"  // Define the module name here
  }

  override fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? {
    return if (name == MODULE_NAME) {
      MyMathLibModule(reactContext)
    } else {
      null
    }
  }

  override fun getReactModuleInfoProvider(): ReactModuleInfoProvider {
    return ReactModuleInfoProvider {
      val moduleInfos: MutableMap<String, ReactModuleInfo> = HashMap()
      moduleInfos[MODULE_NAME] = ReactModuleInfo(
        MODULE_NAME,
        MODULE_NAME,
        false,  // canOverrideExistingModule
        false,  // needsEagerInit
        true,   // hasConstants
        false,  // isCxxModule
        true    // isTurboModule
      )
      moduleInfos
    }
  }
}

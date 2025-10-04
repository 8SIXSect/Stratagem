package com.kmp.stratagem

class WasmPlatform: Platform {
    override val name: String = "Web with Kotlin/Wasm"
    override val supportsQuit: Boolean = false
}

actual fun getPlatform(): Platform = WasmPlatform()
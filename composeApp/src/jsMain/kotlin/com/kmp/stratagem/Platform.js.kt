package com.kmp.stratagem

class JsPlatform: Platform {
    override val name: String = "Web with Kotlin/JS"
    override val supportsQuit: Boolean = false
}

actual fun getPlatform(): Platform = JsPlatform()
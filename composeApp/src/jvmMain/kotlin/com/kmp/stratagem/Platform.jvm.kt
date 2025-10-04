package com.kmp.stratagem

import kotlin.system.exitProcess

class JVMPlatform: Platform {
    override val name: String = "Java ${System.getProperty("java.version")}"
    override val supportsQuit: Boolean = true
    override fun doQuitApp() {
        exitProcess(0);
    }
}

actual fun getPlatform(): Platform = JVMPlatform()

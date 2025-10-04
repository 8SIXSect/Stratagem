package com.kmp.stratagem

interface Platform {
    val name: String
    val supportsQuit: Boolean

    /**
     * Quits the app (platform-independent). This is an action you'd like to perform on Desktop but on like Web.
     * if [supportsQuit] is false, then this function will never run and should not be implemented.
     */
    fun doQuitApp(): Unit {}
}

expect fun getPlatform(): Platform
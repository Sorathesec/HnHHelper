package org.netaphous.hnhhelper

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
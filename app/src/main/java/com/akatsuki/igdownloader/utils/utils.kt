package com.akatsuki.igdownloader.utils


fun checkUrl(url: String): Boolean {
    val patterns = """https://www.instagram.com/direct/(.*?)""".toRegex()
    return patterns.containsMatchIn(url)
}
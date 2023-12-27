package org.example

import kotlinx.atomicfu.atomic

class KotlinClass {
    private val cnt = atomic(0L)

    fun incAndGet(): Long {
        return cnt.incrementAndGet()
    }
}

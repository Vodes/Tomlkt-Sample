/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example

import moe.styx.common.config.UnifiedConfig

fun main() {
    // To create the file if it doesn't exist
    run { UnifiedConfig.current }
    // To try and read it again
    println(UnifiedConfig.current)
}

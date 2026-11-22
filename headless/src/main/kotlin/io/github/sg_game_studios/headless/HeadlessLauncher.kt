@file:JvmName("HeadlessLauncher")

package io.github.sg_game_studios.headless

import com.badlogic.gdx.backends.headless.HeadlessApplication
import com.badlogic.gdx.backends.headless.HeadlessApplicationConfiguration
import io.github.sg_game_studios.Main

/** Launches the headless application. Can be converted into a server application or a scripting utility. */
fun main() {
    HeadlessApplication(Main(), HeadlessApplicationConfiguration().apply {
        // When this value is negative, Main#render() is never called:
        updatesPerSecond = -1
    })
}

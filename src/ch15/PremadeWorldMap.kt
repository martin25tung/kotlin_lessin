package ch15

import java.io.File

class PremadeWorldMap {
    //...
    companion object {
        private const val MAP_FILEPATH = "nyethack.maps"

        fun load() = File(MAP_FILEPATH).readBytes()
    }
}
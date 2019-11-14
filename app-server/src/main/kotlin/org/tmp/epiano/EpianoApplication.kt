package org.tmp.epiano

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EpianoApplication

fun main(args: Array<String>) {
	runApplication<EpianoApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}
}

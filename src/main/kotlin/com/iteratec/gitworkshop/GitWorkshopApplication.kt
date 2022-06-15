package com.iteratec.gitworkshop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GitWorkshopApplication

fun main(args: Array<String>) {
	runApplication<GitWorkshopApplication>(*args)
}

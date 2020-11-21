package br.com.boradeexcursao

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@EnableMongoRepositories
@SpringBootApplication
class MsTravelAgencyApplication

fun main(args: Array<String>) {
	runApplication<MsTravelAgencyApplication>(*args)
}

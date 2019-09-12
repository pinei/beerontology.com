package com.beerontology.stream.service

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.transaction.Transactional

@RunWith(SpringRunner::class)
@SpringBootTest
class BeerServiceTests {

    @Autowired
    val beerService: BeerService? = null

    @Test
    @Transactional
    fun report() {
        val report = beerService!!.getBeerReport()
        var count = 0

        report.values.use {
            it.forEach {
                println(it)
                count++
            }
        }

        assert(count > 0)
    }


}
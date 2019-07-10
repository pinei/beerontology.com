package com.beerontology.stream.controller

import com.beerontology.stream.entity.Beer
import com.beerontology.stream.service.BeerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong
import java.util.stream.Stream
import javax.servlet.http.HttpServletResponse
import javax.transaction.Transactional

@RestController
class BeerController {

    @Autowired
    val beerService: BeerService? = null

    @Transactional
    @GetMapping("/beers")
    fun getAll(response: HttpServletResponse) {
        response.contentType = "application/csv"
        response.addHeader("Content-Disposition", "attachment; filename=beers.csv")

        val writer = response.writer
        writer.println(Beer.CSV_HEADER)

        val data = beerService!!.findAll()

        data.use {
            it.forEach {
                beer -> writer.println(beer.toCSV())
            }
        }

        writer.flush()
    }
}
package com.beerontology.stream.controller

import com.beerontology.stream.service.BeerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class BeerController {

    @Autowired
    val beerService: BeerService? = null

    @GetMapping("/beers")
    fun getAll() =
            beerService.findAll()
}
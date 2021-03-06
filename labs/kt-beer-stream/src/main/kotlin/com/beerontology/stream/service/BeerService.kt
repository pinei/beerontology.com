package com.beerontology.stream.service

import com.beerontology.stream.dao.BeerRepository
import com.beerontology.stream.entity.Beer
import com.beerontology.stream.entity.BeerReport
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.stream.Stream

@Service
class BeerService {

    @Autowired
    val beerRepository: BeerRepository? = null

    fun getBeerReport(): BeerReport {
        val stream : Stream<Beer> = beerRepository!!.reportAll()
        return BeerReport(stream)
    }


}
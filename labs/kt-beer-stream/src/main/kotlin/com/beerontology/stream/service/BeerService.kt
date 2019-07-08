package com.beerontology.stream.service

import com.beerontology.stream.dao.BeerRepository
import org.springframework.stereotype.Service

@Service
class BeerService (
    val beerRepository : BeerRepository

    fun findAll() : Stream<Beer> {
        beerRepository.findAll(USER_NAME_ADAM);
    }
)
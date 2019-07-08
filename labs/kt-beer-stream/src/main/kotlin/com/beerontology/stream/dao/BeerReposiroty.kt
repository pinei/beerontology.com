package com.beerontology.stream.dao

import com.beerontology.stream.entity.Beer
import org.springframework.data.jpa.repository.JpaRepository
import java.util.stream.Stream

interface BeerRepository : JpaRepository<Beer, Int> {
}
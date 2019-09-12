package com.beerontology.stream.dao

import com.beerontology.stream.entity.Beer
import org.springframework.data.jpa.repository.JpaRepository
import java.util.stream.Stream
import org.hibernate.jpa.QueryHints.HINT_FETCH_SIZE
import org.springframework.data.jpa.repository.Query
import org.springframework.data.jpa.repository.QueryHints
import org.springframework.stereotype.Repository
import javax.persistence.QueryHint

/*
 * JPQL sample:
 *   "select b from Beer b"
 *
 * Native Query sample:
 *   "select * from Beer b"
 */
@Repository
interface BeerRepository : JpaRepository<Beer, Int> {

    @QueryHints(value = QueryHint(name = HINT_FETCH_SIZE, value = "1"))
    @Query(value = "select * from Beer b ", nativeQuery = true)
    fun reportAll(): Stream<Beer>

}
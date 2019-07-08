package com.beerontology.stream.dao

import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

class BeerDao {

    @PersistenceContext
    private val entityManager: EntityManager? = null

    fun findAll(): List<T> {
        return entityManager.createQuery("from " + clazz.getName()).resultList
    }


}
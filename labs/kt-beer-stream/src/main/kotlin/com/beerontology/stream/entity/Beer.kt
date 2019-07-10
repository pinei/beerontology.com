package com.beerontology.stream.entity

import javax.persistence.*

@Entity
data class Beer(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int = 0,

    @Column(nullable = false)
    val name: String = "",

    @Column(nullable = false)
    val brand: String = "",

    @Column(nullable = false)
    val style: String = "")
{
    // Static data in Kotlin
    // https://stackoverflow.com/questions/40352684/what-is-the-equivalent-of-java-static-methods-in-kotlin
    companion object {
        val CSV_HEADER = "Name;Brand;Style"
    }

    fun toCSV() : String = "${name};${brand};${style}"
}



package com.beerontology.stream.entity

import java.util.stream.Stream
import javax.persistence.*

class BeerReport(val values : Stream<Beer>) {
    // Static data in Kotlin
    // https://stackoverflow.com/questions/40352684/what-is-the-equivalent-of-java-static-methods-in-kotlin
    companion object {
        val HEADERS = arrayOf( "Name", "Brand", "Style" )
    }
}

@Entity
@Table(name = "Beer")
data class Beer(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int = 0,

    @Column(nullable = false)
    val name: String = "",

    @Column(nullable = false)
    val brand: String = "",

    @Column(nullable = false)
    val style: String = ""
)
{
    fun values() : Array<Any> {
        return arrayOf(name, brand, style)
    }
}
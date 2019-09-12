package com.beerontology.stream.controller

import com.beerontology.stream.entity.BeerReport
import com.beerontology.stream.service.BeerService
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVPrinter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.io.PrintWriter
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
        val report = beerService!!.getBeerReport()

        streamCSV(writer, report)
    }

    private fun streamCSV(writer: PrintWriter, report: BeerReport) {
        val printer : CSVPrinter = CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(*BeerReport.HEADERS))

        printer.use { it ->
            report.values.forEach {
                record -> it.printRecord(*record.values())
            }
        }
    }


}
package com.poja.`big-sum-std22108`.endpoint.rest.controller.health

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;


@RestController
class BigSumController {
    @GetMapping("/big-sum")
    fun bigSum(@RequestParam("a") a: String?, @RequestParam("b") b: String?): String {
        return try {
            val numA = BigInteger(a)
            val numB = BigInteger(b)
            val result = numA.add(numB)
            result.toString()
        } catch (e: NumberFormatException) {
            "erreur"
        }
    }
}


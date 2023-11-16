package com.example.buisinesscaseapp

import com.example.buisinesscaseapp.model.Concession
import com.example.buisinesscaseapp.model.Emplacement


    fun main(){
        val emplacement = Emplacement(1 , 3)
        val emplacement2 = Emplacement(4 , 12)
        val concession = Concession("Ma Concession", listOf(emplacement,emplacement2))
        println(emplacement)
        println(emplacement2)
        println(concession)
    }

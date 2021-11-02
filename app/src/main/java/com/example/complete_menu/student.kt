package com.example.complete_menu

import java.io.Serializable
import kotlin.math.sign

class student: Serializable {
    public lateinit var name: String
    public lateinit var surname: String
    constructor(n: String, s: String){
        name = n
        surname = s
    }
}

class mobile : Serializable {
    lateinit var num: String

    constructor(m: String){
        num = m
    }
}
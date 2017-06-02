package com.sightseeker.studio.demo.javaee.kotlin

import java.io.Serializable
import javax.inject.*
import javax.enterprise.context.*


@Named("bookstore")
@SessionScoped
open class BookStore : Serializable {

    open var name: String = ""

    open var fee: Int = 0

    open fun submit() {
        println("Submit : $name")
    }
}

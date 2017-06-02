package com.sightseeker.studio.demo.javaee.kotlin

import javax.inject.Inject
import javax.ws.rs.ApplicationPath
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.core.Application

@ApplicationPath("rest")
open class HelloWorldApplication : Application()

@Path("bookstore")
open class BookStoreResource {

    @Inject
    lateinit private var store: BookStore

    @GET
    open public fun getName(): String {
        return store.name
    }

}

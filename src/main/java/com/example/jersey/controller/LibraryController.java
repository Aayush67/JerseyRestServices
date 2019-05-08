package com.example.jersey.controller;

import com.example.jersey.model.ApiResponse;
import com.example.jersey.model.Book;
import com.example.jersey.model.ResponseStatus;
import com.example.jersey.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Component
@Path("/library")
public class LibraryController {
    @Autowired
    private LibraryService libraryService;
    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public ApiResponse list()
    {
        return libraryService.list();
    }
    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseStatus add(Book book)
    {
        return libraryService.add(book);
    }
    @DELETE
    @Path("/delete/{sid}")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseStatus delete(@PathParam("sid") int id)
    {
        return libraryService.delete(id);
    }
    @PUT
    @Path("/update")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ResponseStatus Update(Book book)
    {
        return libraryService.update(book);
    }
}

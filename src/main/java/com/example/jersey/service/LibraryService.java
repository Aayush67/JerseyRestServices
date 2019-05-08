package com.example.jersey.service;

import com.example.jersey.model.ApiResponse;
import com.example.jersey.model.Book;
import com.example.jersey.model.ResponseStatus;
import com.example.jersey.repository.LibraryRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {
    @Autowired
    private LibraryRepo libraryRepo;
    public ApiResponse list()
    {
        List<Book> bookList= libraryRepo.findAll();
        ApiResponse response=new ApiResponse();
        response.setResponseCode(1000);
        response.setResponseMessage("Success");
        response.setResponseData(bookList);
        for(Book book:bookList)
                System.out.println(book.getSid()+book.getName()+book.getStatus());
        return response;
    }
    public ResponseStatus add(Book book)
    {
        libraryRepo.save(book);
        return (new ResponseStatus(1000,"Success"));
    }
    public ResponseStatus delete(int bookId)
    {
        try {
            libraryRepo.deleteById(bookId);
            return (new ResponseStatus(1000, "Success"));
        }
        catch (Exception e)
        {
            return (new ResponseStatus(400, "Book Id Doesn't Exist"));
        }
    }
    public ResponseStatus update(Book book)
    {
        Optional<Book> optional=libraryRepo.findById(book.getSid());
        if(!optional.isPresent())
            return (new ResponseStatus(400,"Book Id Not Found"));
        Book bookData=optional.get();
        bookData.setName(book.getName());
        bookData.setStatus(book.getStatus());
        libraryRepo.save(bookData);
        return (new ResponseStatus(1000,"Success"));
    }
}

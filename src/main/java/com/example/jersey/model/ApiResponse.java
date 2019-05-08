package com.example.jersey.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class ApiResponse {
    private String responseMessage;
    private  int responseCode;
    private List<Book> responseData;
}

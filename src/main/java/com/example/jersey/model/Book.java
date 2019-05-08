package com.example.jersey.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity @Table(name = "book") @Getter @Setter
public class Book {
    @Id
    @Column(name = "Sid")
    private int sid;
    @Column(name = "Name")
    private String name;
    @Column(name = "Status")
    private String status;
}

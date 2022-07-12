package com.daniel.learnspringboot.courses.models;

public class Course {

    private Long id;
    private String name;
    private String author;


    public Course(Long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s",id,name,author);
    }
}

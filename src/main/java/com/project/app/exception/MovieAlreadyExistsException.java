package com.project.app.exception;

public class MovieAlreadyExistsException extends RuntimeException {
    public MovieAlreadyExistsException(String title) {
        super("A movie with title " + title + " already exists");
    }
}

package com.example.ProjectService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProjectNotFoundException extends RuntimeException  {
    public ProjectNotFoundException(Long projectId) {
        super("Project not found with id: " + projectId);
    }
    public ProjectNotFoundException(String message) {
        super(message);
    }
}

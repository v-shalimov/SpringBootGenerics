package ua.org.vshalimov.springboot.generics.base;

import lombok.Getter;

@Getter
public enum ErrorType {

    ENTITY_NOT_SAVED("Entity not saved"),
    ENTITY_NOT_FOUND("Entity not found"),
    ENTITY_NOT_UPDATED("Entity not updated");

    private String description;

    ErrorType(String description) {
        this.description = description;
    }

}

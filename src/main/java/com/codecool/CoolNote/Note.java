package com.codecool.CoolNote;

import javax.persistence.*;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String message;

    public Note(String message) {
        this.message = message;
    }

    public Note() {
    }

    public String getMessage() {
        return message;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

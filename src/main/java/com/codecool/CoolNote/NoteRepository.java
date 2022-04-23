package com.codecool.CoolNote;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class NoteRepository {
    private static final List<Note> notes = new ArrayList<>();


    @PostConstruct
    public void init() {
        notes.add(new Note("Ala ma kota"));
        notes.add(new Note("dupa"));
        notes.add(new Note("Kot ma ale"));
    }

    public List<Note> findAll() {
        return notes;
    }

    public void save(Note note){
        notes.add(note);
    }

}

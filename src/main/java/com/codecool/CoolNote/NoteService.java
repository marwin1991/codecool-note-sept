package com.codecool.CoolNote;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class NoteService {

    private final NoteRepository noteRepository;

    public Iterable<Note> getAll() {
        return noteRepository.findAll();
    }

    public void addNote(Note note) {
        noteRepository.save(note);
    }
}

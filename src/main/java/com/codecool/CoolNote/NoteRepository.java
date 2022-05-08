package com.codecool.CoolNote;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface NoteRepository extends CrudRepository<Note, Long> {
}

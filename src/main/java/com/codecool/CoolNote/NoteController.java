package com.codecool.CoolNote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NoteController {
    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("notes", noteService.getAll());
        return "index";
    }


    @GetMapping("note")
    public String displayNote() {
        return "display_note";
    }

    @PostMapping("note")
    public String addNote(@ModelAttribute Note note) {
        noteService.addNote(note);
        return "redirect:/";
    }

    @GetMapping("add_note")
    public String displayAddNote(Model model) {
        model.addAttribute("title", "Adding note");
        model.addAttribute("note", new Note());
        return "add_note";
    }

}

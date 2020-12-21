package flashcardapi.controllers;

import flashcardapi.model.Flashcard;
import flashcardapi.service.Flashcard_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping
@RestController
public class Flashcard_Controller {

    private final Flashcard_Service flashcard_service;

    @Autowired
    public Flashcard_Controller(Flashcard_Service flashcard_service) {
        this.flashcard_service = flashcard_service;
    }

    @PostMapping("flashcard")
    public void addFlashcard(@RequestBody Flashcard flashcard) {
        this.flashcard_service.addFlashcard(flashcard);
    }

    @GetMapping("list_cards")
    public ArrayList<String> listFlashcard() {
        var test = new ArrayList<String>();
        test.add("first one");
        return test;
    }
}

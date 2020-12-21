package flashcardapi.service;

import flashcardapi.dao.Flashcard_Dao;
import flashcardapi.model.Flashcard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Flashcard_Service {
    private final Flashcard_Dao flashcard_dao;

    @Autowired
    public Flashcard_Service(@Qualifier("fakeDao") Flashcard_Dao flashcard_dao) {
        this.flashcard_dao = flashcard_dao;
    }

    public int addFlashcard(Flashcard flashcard) {
        return flashcard_dao.insertFlashcard(flashcard);
    }
}

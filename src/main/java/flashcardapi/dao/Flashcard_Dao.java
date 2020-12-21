package flashcardapi.dao;

import flashcardapi.model.Flashcard;

import java.util.UUID;

public interface Flashcard_Dao {

    int insertFlashcard(UUID id, Flashcard flashcard);

    default int insertFlashcard(Flashcard flashcard) {
        UUID id = UUID.randomUUID();
        return insertFlashcard(id, flashcard);
    }
}

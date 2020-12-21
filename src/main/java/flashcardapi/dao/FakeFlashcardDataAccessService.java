package flashcardapi.dao;

import flashcardapi.model.Flashcard;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakeFlashcardDataAccessService implements Flashcard_Dao {

    private static List<Flashcard> DB = new ArrayList<>();

    @Override
    public int insertFlashcard(UUID id, Flashcard flashcard) {
        DB.add(new Flashcard(id, flashcard.getName(), flashcard.getMeaning()));
        return 1;
    }


}

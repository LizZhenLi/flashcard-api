package flashcardapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Flashcard {
    private final UUID id;
    private final String name;
    private final String meaning;


    public String getMeaning() {
        return meaning;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Flashcard(@JsonProperty("id") UUID id,
                     @JsonProperty("name") String name,
                     @JsonProperty("meaning") String meaning) {
        this.id = id;
        this.name = name;
        this.meaning = meaning;
    }
}

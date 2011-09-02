package object.calisthenics;

import java.util.ArrayList;
import java.util.List;

public class WordsBuilder {

    private List<Word> words = new ArrayList<Word>();

    public WordsBuilder withNoWords() {
        this.words = new ArrayList<Word>();
        return this;
    }

    public WordsBuilder withWords(String... otherWords) {
        words = new ArrayList<Word>();

        for (String otherWord : otherWords) {
            words.add(new Word(otherWord));
        }

        return this;
    }

    public Words build() {
        return new Words(words);
    }

}

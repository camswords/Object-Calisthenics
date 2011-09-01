package object.calisthenics;

import java.util.ArrayList;
import java.util.List;

public class WordsBuilder {

    private List<Word> words = new ArrayList<Word>();

    public WordsBuilder withNoWords() {
        this.words = new ArrayList<Word>();
        return this;
    }

    public WordsBuilder withWords(String... words) {
        this.words = new ArrayList<Word>();

        for (String word : words) {
            this.words.add(new Word(word));
        }

        return this;
    }

    public Words build() {
        return new Words(words);
    }

}

package object.calisthenics;

import java.util.ArrayList;
import java.util.List;

// this code is a modified example originating from code found on http://www.neiljohan.com/java

public class Words {

    private final List<Word> words;

    public Words(List<Word> words) {
        this.words = words;
    }

    public Words reverseEvens() {
        return evenWords().reversed();
    }

    public Words evenWords() {
        List<Word> evens = new ArrayList<Word>();

        for (int i = 0; i < words.size(); i++) {
            if ( (i + 1) % 2 == 0) {
                evens.add(words.get(i));
            }
        }

        return new Words(evens);
    }

    public Words reversed() {
        List<Word> reversed = new ArrayList<Word>();

        for (Word word : words) {
            reversed.add(word.reverse());
        }

        return new Words(reversed);
    }

    public String join() {
        String joined = "";

        for (Word word : words) {
            joined += " " + word.describe();
        }

        return joined;
    }
}

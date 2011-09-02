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
        return evenWords().eachReversed();
    }

    public Words evenWords() {
        List<Word> evens = new ArrayList<Word>();

        for (int i = 1; i < words.size(); i += 2) {
            Word evenWord = words.get(i);
            evens.add(evenWord);
        }

        return new Words(evens);
    }

    public Words eachReversed() {
        List<Word> reversed = new ArrayList<Word>();

        for (Word word : words) {
            Word reversedWord = word.reverse();
            reversed.add(reversedWord);
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

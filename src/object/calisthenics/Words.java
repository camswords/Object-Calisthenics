package object.calisthenics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Words implements Iterable<Word> {

    private final List<Word> words;

    public Words(List<Word> words) {
        this.words = words;
    }

    public Iterator<Word> iterator() {
        return words.iterator();
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
}

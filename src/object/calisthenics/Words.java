package object.calisthenics;

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
}

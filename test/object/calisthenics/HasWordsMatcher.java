package object.calisthenics;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.internal.matchers.TypeSafeMatcher;

public class HasWordsMatcher extends TypeSafeMatcher<Words> {

    private final String words;

    public HasWordsMatcher(String words) {
        this.words = words;
    }

    @Override
    public boolean matchesSafely(Words otherWords) {
        String sentence = otherWords.join();
        return words.equals(sentence);
    }

    public void describeTo(Description description) {
        description.appendText("has words: '" + words + "'");
    }

    public static Matcher<Words> hasWords(String words) {
        return new HasWordsMatcher(words);
    }
}

package object.calisthenics;

import org.junit.Test;

import static object.calisthenics.HasWordsMatcher.hasWords;
import static org.junit.Assert.assertThat;

public class WordsTest {

    @Test
    public void shouldDoNothingWithAnEmptyString() {
        Words words = new WordsBuilder().withNoWords().build();
        assertThat(words.reverseEvens(), hasWords(""));
    }

    @Test
    public void firstWordShouldRemainUnchanged() {
        Words words = new WordsBuilder().withWords("my", "sentence", "has", "been", "reversed").build();
        assertThat(words.reverseEvens(), hasWords(" ecnetnes neeb"));
    }
}

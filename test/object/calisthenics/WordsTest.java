package object.calisthenics;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class WordsTest {

    @Test
    public void shouldDoNothingWithAnEmptyString() {
        Words words = new WordsBuilder().withNoWords().build();
        assertThat(words.reverseEvens(), equalTo(""));
    }

    @Test
    public void firstWordShouldRemainUnchanged() {
        Words words = new WordsBuilder().withWords("my", "sentence", "has", "been", "reversed").build();
        assertThat(words.reverseEvens(), equalTo(" ecnetnes neeb"));
    }
}

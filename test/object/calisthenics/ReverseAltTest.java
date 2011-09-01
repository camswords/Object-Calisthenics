package object.calisthenics;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ReverseAltTest {


    @Test
    public void shouldDoNothingWithAnEmptyString() {
        Words words = new WordsBuilder().withNoWords().build();
        assertThat(new ReverseAlt().reverseSecondWords(words), equalTo(""));
    }

    @Test
    public void firstWordShouldRemainUnchanged() {
        Words words = new WordsBuilder().withWords("my", "sentence", "has", "been", "reversed").build();
        assertThat(new ReverseAlt().reverseSecondWords(words), equalTo(" my ecnetnes has neeb reversed "));
    }
}

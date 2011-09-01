package object.calisthenics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ReverseAltTest {


    @Test
    public void shouldDoNothingWithAnEmptyString() {
        List<Word> words = new ArrayList<Word>();
        assertThat(new ReverseAlt().reverseSecondWords(words), equalTo(""));
    }

    @Test
    public void firstWordShouldRemainUnchanged() {
        List<Word> words = Arrays.asList(new Word("my"), new Word("sentence"),
                                         new Word("has"), new Word("been"),
                                         new Word("reversed"));
        assertThat(new ReverseAlt().reverseSecondWords(words), equalTo(" my ecnetnes has neeb reversed "));
    }
}

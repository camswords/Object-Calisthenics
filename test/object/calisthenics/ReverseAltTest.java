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
        ArrayList<String> words = new ArrayList<String>();
        assertThat(new ReverseAlt().reverseSecondWords(words), equalTo(""));
    }

    @Test
    public void firstWordShouldRemainUnchanged() {
        List<String> words = Arrays.asList("my", "sentence", "has", "been", "reversed");
        assertThat(new ReverseAlt().reverseSecondWords(words), equalTo(" my ecnetnes has neeb reversed "));
    }
}

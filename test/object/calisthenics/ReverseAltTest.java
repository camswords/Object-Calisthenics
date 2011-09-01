package object.calisthenics;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ReverseAltTest {


    @Test
    public void shouldDoNothingWithAnEmptyString() {
        assertThat(new ReverseAlt().reverseSecondWords(""), equalTo(""));        
    }

    @Test
    public void firstWordShouldRemainUnchanged() {
        assertThat(new ReverseAlt().reverseSecondWords("check this out"), equalTo(" check siht out "));
    }
}

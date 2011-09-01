package object.calisthenics;

// this code is a modified example originating from code found on http://www.neiljohan.com/java

public class ReverseAlt {

    public String reverseSecondWords(Words words) {
        String result = "";

        for(Word word : words.evenWords()) {
            result += " " + word.reverse();
        }

        return result;
    }
}

package object.calisthenics;

// this code is a modified example originating from code found on http://www.neiljohan.com/java

public class ReverseAlt {

    public String reverseSecondWords(Words words) {
        String result = "";
        boolean reverseWord = false;

        for(Word word : words) {

            if (reverseWord) {
                result += word.reverse();
            }
        }

        return result;
    }
}

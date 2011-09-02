package object.calisthenics;

// this code is a modified example originating from code found on http://www.neiljohan.com/java

import java.util.List;


public class ReverseAlt {

    public String reverseSecondWords(List<String> words) {
        String result = "";
        int reverseWord = 0;

        for (int wordNumber = 0; wordNumber < words.size(); wordNumber++) {
            String thisWord = words.get(wordNumber);

            if (reverseWord == 0) {
                reverseWord = 1;
            } else {
                result += " ";

                for (int charNumber = thisWord.length(); charNumber > 0; charNumber--) {
                    result += thisWord.charAt(charNumber - 1);
                }

                reverseWord = 0;
            }
        }
        return result;
    }
}

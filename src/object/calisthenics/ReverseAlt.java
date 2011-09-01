package object.calisthenics;

// this code is a modified example originating from code found on http://www.neiljohan.com/java

import java.util.List;


public class ReverseAlt {

    public String reverseSecondWords(List<String> words) {
        String result = "";

        int noWords = words.size();

        int reverseWord = 0;

        for (int wordNumber = 0; wordNumber < noWords; wordNumber++) {

            String thisWord = words.get(wordNumber);

            if (reverseWord == 0) {
                result += " " + thisWord + " ";
                reverseWord = 1;
            } else {

                int stringLength = thisWord.length();

                for (int charNumber = stringLength; charNumber > 0; charNumber--) {
                    result += thisWord.charAt(charNumber - 1);
                }

                reverseWord = 0;
            }
        }

        return result;
    }
}

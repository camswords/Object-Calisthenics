package object.calisthenics;

// this code has been modified code found on http://www.neiljohan.com/java

import java.util.StringTokenizer;


public class ReverseAlt {

    public String reverseSecondWords(String tLine) {
        String result = "";

        StringTokenizer tTokensOnLine = new StringTokenizer(tLine);
        int noToks = tTokensOnLine.countTokens();

        int reverseWord = 0;

        for (int wordNumber = 0; wordNumber < noToks; wordNumber++) {

            String tThisToken = tTokensOnLine.nextToken();
            String tThisWord = tThisToken;

            if (reverseWord == 0) {
                result += " " + tThisToken + " ";
                reverseWord = 1;
            } else {

                int tStringLength = tThisWord.length();

                for (int tCharNumber = tStringLength; tCharNumber > 0; tCharNumber--) {
                    result += tThisWord.charAt(tCharNumber - 1);
                }

                reverseWord = 0;
            }
        }

        return result;
    }
}

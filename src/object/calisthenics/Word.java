package object.calisthenics;

public class Word {

    private final String word;

    public Word(String word) {
        this.word = word;
    }

    public String reverse() {
        String reversed = "";

        for (int charNumber = word.length(); charNumber > 0; charNumber--) {
            reversed += word.charAt(charNumber - 1);
        }

        return reversed;
    }
}

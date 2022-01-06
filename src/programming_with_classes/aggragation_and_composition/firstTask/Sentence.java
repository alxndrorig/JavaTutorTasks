package programming_with_classes.aggragation_and_composition.firstTask;

public class Sentence {
    private String sentence;

    public Sentence() {
    }

    public Sentence(String sentence) {
        if (sentence.trim().matches(".*[\\!\\.\\?].*[\\!\\.\\?]")) System.out.println("Error!");
        else if (sentence.matches(".*[^\\.\\?\\!]$")) this.sentence = sentence + ".";
        else this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        if (sentence.trim().matches(".*[\\!\\.\\?].*[\\!\\.\\?]")) System.out.println("Error!");
        else this.sentence = sentence;
    }

    public void addWord(String word, int index) {
        final int WORDSCOUNT = sentence.split(" ").length;
        if (index > WORDSCOUNT) {
            System.out.println(String.format("Error! %d words in sentence", sentence.split(" ").length));
            return;
        }
        char symbol = sentence.charAt(sentence.length() - 1);
        if (index == WORDSCOUNT) {
            this.sentence = sentence.substring(0, sentence.length() - 1) + " " + word + symbol;
            return;
        }
        if (index == 0) {
            this.sentence = word.toString().trim() + " " + Character.toLowerCase(sentence.charAt(0)) + sentence.substring(1);
        } else {
            int counter = 0;
            int i = 0;
            while (counter != index) {
                if (sentence.charAt(i) == ' ') counter++;
                i++;
            }
            this.sentence = sentence.substring(0, i) + word + " " + sentence.substring(i);
        }
    }
    public void addWord(Word word, int index) {
        final int WORDSCOUNT = sentence.split(" ").length;
        if (index > WORDSCOUNT) {
            System.out.println(String.format("Error! %d words in sentence", sentence.split(" ").length));
            return;
        }
        char symbol = sentence.charAt(sentence.length() - 1);
        if (index == WORDSCOUNT) {
            this.sentence = sentence.substring(0, sentence.length() - 1) + " " + word + symbol;
            return;
        }
        if (index == 0) {
            this.sentence = word.toString().trim() + " " + Character.toLowerCase(sentence.charAt(0)) + sentence.substring(1);
        } else {
            int counter = 0;
            int i = 0;
            while (counter != index) {
                if (sentence.charAt(i) == ' ') counter++;
                i++;
            }
            this.sentence = sentence.substring(0, i) + word + " " + sentence.substring(i);
        }
    }

    public int length() {
        return this.sentence.length();
    }

    @Override
    public String toString() {
        return sentence;
    }
}

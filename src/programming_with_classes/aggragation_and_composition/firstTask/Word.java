package programming_with_classes.aggragation_and_composition.firstTask;

public class Word {
    private String word;

    public Word(String word) {
        if (word.trim().indexOf(' ') > -1) System.out.println("Error! The word cannot contain a space!");
        else this.word = word.trim();
    }

    public Word() {
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        if (word.trim().indexOf(' ') > -1) System.out.println("Error! The word cannot contain a space!");
        else this.word = word;
    }

    public void addSymbol(char symbol) {
        if (symbol == ' ') System.out.println("Error! The word cannot contain a space!");
        else this.word = word + symbol;
    }

    public void deleteSymbol(int index) {
        if (index > word.length() - 1) System.out.println("Error! Word length = " + word.length());
        else if (index == word.length() - 1) this.word = word.substring(0, word.length() - 1);
        else this.word = word.substring(0, index) + word.substring(index + 1);
    }

    public int length() {
        return this.word.length();
    }

    @Override
    public String toString() {
        return word;
    }
}

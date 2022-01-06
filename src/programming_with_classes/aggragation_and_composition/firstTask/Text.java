package programming_with_classes.aggragation_and_composition.firstTask;

public class Text {
    private String text;
    private String title;

    public Text() {
    }

    public Text(String text) {
        this.text = text;
    }

    public Text(String text, String title) {
        this.text = text;
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTitle(Word title) {
        this.title = title.toString();
    }

    public void setTitle(Sentence title) {
        this.title = title.toString();
    }

    public void addWord(String word) {
        this.text = text + word;
    }

    public void addSentence(String sentence) {
        this.text = text + sentence;
    }

    public void addWord(Word word) {
        this.text = text + word;
    }

    public void addSentence(Sentence sentence) {
        this.text = text + sentence;
    }

    public void add(String string) {
        this.text = text + " " + text;
    }
    public void showText() {
        System.out.println(this.title + "\n" + this.text);
    }
}

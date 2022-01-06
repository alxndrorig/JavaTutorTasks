package programming_with_classes.aggragation_and_composition.firstTask;

/**
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
 * консоль текст, заголовок текста.
 */
public class Main {
    public static void main(String[] args) {
        Word word = new Word("Hello");
        word.deleteSymbol(1);
        System.out.println(word);

        Sentence sentence = new Sentence("How are you?");
        System.out.println(sentence);
        sentence.addWord("Michael", 3);
        sentence.addWord(word, 0);
        System.out.println(sentence);

        Text text = new Text("Hello, world! How are you?", "Default title");
        text.setTitle("First app!");
        text.getTitle();
        text.showText();
    }
}

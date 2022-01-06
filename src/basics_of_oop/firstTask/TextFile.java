package basics_of_oop.firstTask;

public class TextFile extends File{

    public TextFile(Directory directory, String name) {
        super(directory, name);
    }

    public TextFile(Directory directory, String name, String content) {
        super(directory, name, content);
    }

    @Override
    public void print() {
        if (this.getContent() == null) System.out.println("File \"" + this.getName() + "\" is empty!");
        else System.out.println("------\n\"" + this.getName() + "\":\n" + this.getContent() + "\n------");
    }

    @Override
    public void append(String text) {
        this.setContent(this.getContent() + "\n" + text);
    }
}
package basics_of_oop.firstTask;

public class Main {
    public static void main(String[] args) {
        TextFile emptyFile = new TextFile(new Directory(".\\basics_of_oop\\firstTask\\"), "First file");
        emptyFile.create();
        TextFile helloWorldFile = new TextFile(new Directory(".\\basics_of_oop\\firstTask\\"), "Program", "Hello world");
        helloWorldFile.create();
        emptyFile.delete();
        emptyFile.print();
        helloWorldFile.print();
        helloWorldFile.rename("New file name");
        helloWorldFile.append("This is my first program!");
        helloWorldFile.print();
    }
}

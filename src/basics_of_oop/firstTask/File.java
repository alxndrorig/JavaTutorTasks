package basics_of_oop.firstTask;

import java.util.ArrayList;

public abstract class File{
    private final Directory directory;
    private String name;
    private String content;
    private static final ArrayList<File> files = new ArrayList<>();


    public File(Directory directory, String name, String content) {
        this.directory = directory;
        this.name = name;
        this.content = content;
    }

    public File(Directory directory, String name) {
        this.directory = directory;
        this.name = name;
        this.content = null;
    }

    public void create() {
        files.add(this);
    }
    public void delete() {
        files.remove(this);
    }

    public void rename(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public abstract void print();

    public abstract void append(String text);

    String getContent() {
        return content;
    }

    void setContent(String content) {
        this.content = content;
    }
}
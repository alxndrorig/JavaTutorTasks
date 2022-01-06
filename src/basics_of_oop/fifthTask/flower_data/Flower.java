package basics_of_oop.fifthTask.flower_data;

public abstract class Flower {
    private String name;
    private String color;

    public Flower(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + (name == null ? 0 : name.hashCode());
        result = PRIME * result + (color == null ? 0 : color.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Flower object = (Flower) obj;
        if (name == null && object.name != null)
            return false;
        if (color == null && object.color != null)
            return false;
        if (object.name == null && name != null)
            return false;
        if (object.color == null && color != null)
            return false;
        if (!name.equals(object.name))
            return false;
        return color.equals(object.color);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

package programming_with_classes.simplest_classes.fifthTask;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Counter counter1 = new Counter(); //counter1 = 0
        Counter counter2 = new Counter(4);//counter2 = 4

        counter1.increment(); //counter1 = 1
        counter2.decrement(); //counter2 = 3

        System.out.println(counter1.getValue() + " " + counter2.getValue()); //get current values
    }
}

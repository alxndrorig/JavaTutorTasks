package programming_with_classes.simplest_classes.firstTask;


public class Main {

    public static void main(String[] args) {
        Test1 test = new Test1();
        test.setA(4);
        test.setB(5);
        System.out.println(test.getSum()); //9
        test.setA(10);
        test.setB(15);
        test.getA();
        test.getB();
        System.out.println(test.getSum()); //25
        System.out.println(test.getMax()); //15
    }
}

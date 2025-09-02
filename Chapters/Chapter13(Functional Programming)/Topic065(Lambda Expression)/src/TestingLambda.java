public class TestingLambda {
    public static void main(String[] args) {
        TestingLambda test = new TestingLambda();
        System.out.println(test.sum(1,2));
        test.printString("Hello World!!");

        /* 
        (x,y) -> {
        int sum = a + b;
        return sum;
        } 
        */
        /* 
        toPrint -> System.out.println(toPrint);
        */
        /* 
        () -> System.out.println("Hello World!!");
        */
    }

    private int sum(int x, int y){
        int sum = x + y;
        return sum;
    }

    private void printString(String toPrint){
        System.out.println(toPrint);
    }
}

public class OrderOfOperationInArithematicOperators {
    public static void main(String[] args) {
        System.out.println(8-3*3); //Uses BODMAS to decide with operation to do first 

        System.out.println(9/(3/3 + 2)); //if the operations of same importance are there then it is evaluated from left to right direction
    }
}
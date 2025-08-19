public class FunctionOrMethod {
    //In java we write functions inside a class.. Hance they can be called as Methods more accurately..
    public static void main(String[] args) {
        greeting(); //Invoking or calling a Method
        System.out.println();
        
        printFirstPattern();
        System.out.println();
        printSecondPattern();
        System.out.println();
        printThirdPattern();
    }

    public static void greeting() {
        System.out.println("Good Morning!!");
    }

    public static void printThirdPattern() {
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }

    public static void printSecondPattern() {
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }

    public static void printFirstPattern() {
        for(int i = 0; i < 5 ; i++){
            for(int j = 0; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class ForEachLoop {
    public static void main(String[] args) {
        String[] nameArray = new String[] { "Soham", "Mayank", "Tej" };
        printArray(nameArray);
    }

    public static void printArray(String[] arr){
        for(String name : arr){
            System.out.println(name);
        }
    }
}
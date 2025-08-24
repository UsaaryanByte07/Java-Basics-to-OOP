public class Car extends Vehicle{
    @Override
    void service(){
        super.service();
        System.out.println("The Car is Ready for Service.");
    }
}

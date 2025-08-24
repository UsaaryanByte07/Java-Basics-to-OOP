public class Vehicle {
    /*
     * 68. Define a base class Vehicle with a method service() and a
     * subclass Car that overrides service(). In Car's service(),
     * provide a specific implementation that calls super.service()
     * as well, to show how overriding works.
     */
    void service(){
        System.out.println("Your Vehicle is Ready for Servicing");
    }
}

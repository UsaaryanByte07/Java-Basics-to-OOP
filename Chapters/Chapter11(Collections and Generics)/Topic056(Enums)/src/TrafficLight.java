public enum TrafficLight {
    RED("Stop"), GREEN("Go"), YELLOW("Get Ready");

    private final String action;

    TrafficLight(String action){
        this.action = action;
    }
}

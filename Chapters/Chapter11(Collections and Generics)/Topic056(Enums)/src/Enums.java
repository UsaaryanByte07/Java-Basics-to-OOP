public class Enums {
    public static void main(String[] args) {
        TrafficLight color = TrafficLight.RED;
        color = TrafficLight.YELLOW;

        Grade grade1 = Grade.A;
        Grade grade2 = Grade.valueOf("A");

        for (Grade value : Grade.values()) {
            System.out.println(value);
        }
    }
}

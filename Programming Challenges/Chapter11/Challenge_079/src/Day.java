public enum Day {
    MONDAY("Weekday"), TUESDAY("Weekday"), WEDNESDAY("Weekday"), THURSDAY("Weekday"), FRIDAY("Weekday"),
    SATURDAY("Weekend"), SUNDAY("Weekend");

    final String typeOfDay;

    Day(String typeOfDay) {
        this.typeOfDay = typeOfDay;
    }

    String getTypeOfDay(){
        return typeOfDay;
    }
}

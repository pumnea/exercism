public class Lasagna {
    private static final int MINUTES_IN_OVEN = 40;
    private static final int MINUTES_PER_LAYER = 2;

    public int expectedMinutesInOven() {
        return MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven(int in) {
        return MINUTES_IN_OVEN - in;
    }

    public int preparationTimeInMinutes(int layers) {
        return MINUTES_PER_LAYER * layers;
    }

    public int totalTimeInMinutes(int layers, int minutes) {
        return MINUTES_PER_LAYER * layers + minutes;
    }
}

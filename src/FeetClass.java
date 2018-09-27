public class FeetClass {
    private double value;
    private double newLength;

    public FeetClass(double value) {
        this.value = value;
    }

    public double getLengthInMeter() {
        newLength = value * 0.3048;
        return newLength;
    }

    public double getLengthInInch() {
        newLength = value * 12;
        return newLength;
    }
}

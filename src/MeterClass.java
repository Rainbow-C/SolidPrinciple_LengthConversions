public class MeterClass {
    private double value;
    private double newLength;

    public MeterClass(double value) {
        this.value = value;
    }

    public double getLengthInFeet() {
        newLength = value * 3.28084;
        return newLength;
    }

    public double getLengthInInch() {
        newLength = value * 39.3701;
        return newLength;
    }
}

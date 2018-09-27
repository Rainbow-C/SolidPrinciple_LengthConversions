public class InchClass {
    private double value;
    private double newlength;
    public InchClass(double value) {
        this.value = value;
    }

    public double getLengthInMeter(){
        newlength = value * 0.0254;
        return newlength;
    }

    public double getLengthInFeet(){
        newlength = value * 0.0833333;
        return  newlength;
    }
}

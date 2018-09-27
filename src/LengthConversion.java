public class LengthConversion {
    private String unit;
    private double value;

    public LengthConversion(Length l) {
        this.unit = l.getLengthUnit();
        this.value = l.getLengthValue();
    }

    public void getConvertedLength() {
        switch (unit) {
            case "meter":
                MeterClass meterClassObj = new MeterClass(value);
                System.out.println("Length in Feet: " + meterClassObj.getLengthInFeet());
                System.out.println("Length in Inch: " + meterClassObj.getLengthInInch());
                break;
            case "inch":
                InchClass inchClassObj = new InchClass(value);
                System.out.println("Length in Meter: " + inchClassObj.getLengthInMeter());
                System.out.println("Length in Feet: " + inchClassObj.getLengthInFeet());
                break;
            case "feet":
                FeetClass feetClassObj = new FeetClass(value);
                System.out.println("Length in Meter: " + feetClassObj.getLengthInMeter());
                System.out.println("Length in Inch: " + feetClassObj.getLengthInInch());
                break;
            default:
                System.out.println("Invalid length format entered !!");
        }
    }

}

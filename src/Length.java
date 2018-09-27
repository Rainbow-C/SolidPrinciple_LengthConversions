import java.util.Scanner;

public class Length {

    private String unit;
    private double value;

    public Length(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit(meter/inch/feet): ");
        unit = sc.nextLine();
        System.out.println("Enter the number: ");
        value = sc.nextDouble();
        sc.close();
    }

    public double getLengthValue(){
        return value;
    }

    public String getLengthUnit(){
        return unit;
    }
}

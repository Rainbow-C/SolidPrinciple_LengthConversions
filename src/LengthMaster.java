import java.util.Scanner;

public class LengthMaster {

    public static void main(String args[]) {
        Length lengthObj = new Length();
        System.out.println("Given length in other units: ");
        LengthConversion lengthConversion = new LengthConversion(lengthObj);
        lengthConversion.getConvertedLength();
    }
}

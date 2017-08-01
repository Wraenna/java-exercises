package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Float miles;
        Float gallons;
        Scanner miles_driven;
        Scanner gallons_used;

        miles_driven = new Scanner(System.in);
        System.out.println("How many miles have you driven? ");
        miles = miles_driven.nextFloat();

        gallons_used = new Scanner(System.in);
        System.out.println("How many gallons of gas have you used? ");
        gallons = gallons_used.nextFloat();

        Float mpg = miles / gallons;
        System.out.println("You're currently getting this MPG: " + mpg);
    }
}

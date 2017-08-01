package org.launchcode.java.studios;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Double radius;
        Double pi = 3.14;
        Scanner rad;

        rad = new Scanner(System.in);
        System.out.println("Please enter a radius: ");
        radius = rad.nextDouble();

        if (radius <= 0) {
            while (radius <= 0) {
                System.out.println("Your radius needs to be greater than zero.");
                System.out.println("Please enter a radius: ");
                radius = rad.nextDouble();
            }
        }

            Double area = pi * radius * radius;
            System.out.println("The area of a circle of radius " + radius + " is: " + area);

    }
}

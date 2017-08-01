package exercises;
import java.util.Scanner;

public class RectArea {
    public static void main(String[] args) {
        Integer length;
        Integer width;
        Scanner length_in;
        Scanner width_in;

        length_in = new Scanner(System.in);
        System.out.println("Please enter a length: ");
        length = length_in.nextInt();

        width_in = new Scanner(System.in);
        System.out.println("Please enter a width: ");
        width = width_in.nextInt();

        Integer area = length * width;
        System.out.println("The area of your rectangle is: " + area);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter subtotal: ");
        float subtotal = reader.nextInt();

        System.out.print("Enter gratuity: ");
        float inputGratuity = reader.nextInt();
        reader.close();
        float calculatedGratuity = subtotal * (inputGratuity/100);

        float total = subtotal + calculatedGratuity;

        System.out.println("The gratuity is $" + calculatedGratuity + " and total is $" + total );
    }
}
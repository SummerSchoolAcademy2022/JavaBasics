import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Write a Java program to calculate and print factorial of a given number E.g.:5 ! = 1 * 2 * 3 * 4 * 5;
        System.out.println("Introdu un numar ca sa facem factorialu!");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int fact = 1;
        if (x < 0) {
            System.out.println("Eroare!");
        } else {
            for (int i = 1; i <= x; i++) {
                fact *= i;
            }

            System.out.println("!x = " + fact);
        }

        //Write a Java program to ask the user to enter numbers until the character '0' is entered and calculate their average value.
        int contor = 0;
        int sum = 0;
        int currentNumber;
        do {
            System.out.print("Enter a number: ");
            currentNumber = scn.nextInt();
            sum += currentNumber;
            if (currentNumber != 0) {
                contor++;
            }
        } while (currentNumber != 0);

        if (contor != 0) {
            System.out.println("Average value is: " + (sum / contor));
        } else {
            System.out.println("No number inserted!");
        }

        int varsta = 3;
        final int unAnVarsta = 1;

        switch (varsta) {
            case unAnVarsta:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("esti un bebelus!");
                break;
            case 10:
                System.out.println("10 ani");
                break;
            case 11:
                System.out.println("11 ani");
            default:
                System.out.println("default!");
        }

        Mouse m1 = new Mouse();
        Product cola = new Product("Cola", 220); // vrem sa avem un astfel de produs?
//        System.out.println(cola);

        Product product2 = new Product(0, "Nestle");
//        System.out.println(product2);

        Product[] products = new Product[3];
        products[0] = cola;
        products[1] = product2;

        Product product3 = new Product("Fanta", "Coca-cola");
        products[2] = product3;

        int sumOfproducts = 0;
        System.out.println("List of products:");
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(i + 1 + ". " + products[i]);
                sumOfproducts += products[i].price;
            }
        }
        System.out.println("Sum: " + (sumOfproducts / 100.0) + " RON");
        String str1 = null;
        System.out.println("str1 = " + str1);
    }
}

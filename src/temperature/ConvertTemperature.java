package temperature;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. F->C");
            System.out.println("2. C->F");
            System.out.println("0. Exit");
            System.out.println("Enter-Choice:");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("C->F :");
                    System.out.print("Enter C :");
                    celsius=scanner.nextInt();
                    fahrenheit=celsiusToFahrenheit(celsius);
                    System.out.println(celsius+" C ->"+fahrenheit+"F");
                    break;
                case 2:
                    System.out.println("F->C :");
                    System.out.print("Enter F :");
                    fahrenheit=scanner.nextInt();
                    celsius=fahrenheitToCelsius(fahrenheit);
                    System.out.println(fahrenheit+"F ->"+celsius+"C");
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit= (9.0/5)*celsius+32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius= (5.0 /9)*(fahrenheit-32);
        return celsius;
    }
}

package deleteElementArr;

import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  Finding Number");
        int number = scanner.nextInt();
        int index = -1;
        int count = 0;
        int[] array = {3, 2, 1, 5, 7, 6, 7, 8};
        System.out.print("arr: ");
        for (int element :
                array) {
            System.out.print(element);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
                count++;
            }
        }
        if (index != -1) {
            for (int i = index; index < array.length - 1; index++) {
                array[index] = array[index + 1];
            }
            for (int i = count; i > 0; i--) {
                array[(array.length) - i] = 0;
            }
            System.out.println();
            System.out.println("Finding Number "+number+"-index :" + index);
            System.out.print("arrNew:");
            for (int element :
                    array) {
                System.out.print(element);
            }
        } else {
            System.out.println();
            System.out.println(" No finding number "+number);
            for (int e :
                    array) {
                System.out.print(e);
            }
        }

    }
}

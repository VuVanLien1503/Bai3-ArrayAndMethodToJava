package deleteElementArr;

import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Number add to array");
        int number=scanner.nextInt();
//        scanner.nextLine();
        System.out.println(" Enter index ");
        int index=scanner.nextInt();
        int[]arr;
        arr=new int[10];
        if (index<0&&index>=arr.length-1){
            System.out.println("No add element to Array");
        }else {
            arr[index]=number;
        }
        for (int element :
                arr) {
            System.out.print(element);
        }
    }
}

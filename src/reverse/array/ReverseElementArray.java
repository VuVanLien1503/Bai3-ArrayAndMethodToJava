package reverse.array;

import java.util.Scanner;

public class ReverseElementArray {
    public static void main(String[] args) {
        int [] array;
        Scanner scanner =new Scanner(System.in);
        System.out.println(" Enter-Size :");
        int size=scanner.nextInt();
        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Element "+(i+1)+" : ");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.print(" array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+"\t");
        }

        for (int j = 0; j < array.length / 2; j++) {
            int temp=array[j];
            array[j]=array[size-1-j];
            array[size-1-j]=temp;
        }
        System.out.print("\n");
        System.out.print("ReverseArray : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+"\t");
        }
    }
}

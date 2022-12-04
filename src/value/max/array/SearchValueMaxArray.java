package value.max.array;

import java.util.Scanner;

public class SearchValueMaxArray {
    public static void main(String[] args) {
        int[]array;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number Size Array");
        int size=scanner.nextInt();
        array=new int[size];
        int i=0;
        while (i<size){
            System.out.print("element :"+(i+1)+": ");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.print("array : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+"\t");
        }
        int max=array[0];
        int index=-1;
        for (int j = 0; j < array.length; j++) {
            int temp=array[j];
            if (array[j]>max){
                max=array[j];
                index=j;
            }
        }
        System.out.print("\n"+"Max :"+max+" index : "+index);
    }
}

package FindElementMax;

import java.util.Random;

public class FindElementMaxToArray {
    public static void main(String[] args) {
        Random rd =new Random();
        int random = (int)(Math.random()*100);
        int[][] array=new int[3][3];
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               array[i][j]= (int)(Math.random()*100);;
            }
        }
        System.out.println("array :");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
        }
        System.out.println();
        System.out.println("Max :"+valueMax(array));
    }
    public static int valueMax(int[][] arr){
        int max=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
}

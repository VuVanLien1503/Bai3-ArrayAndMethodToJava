package FindElementMinToArray;

public class FindMinToArray {
    public static void main(String[] args) {

        int [][] array=new int[3][3];
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]= (int)(Math.random()*(9)+1);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println(findMin(array));
        System.out.println("Sum 2 Cross:"+sumCross(array));

    }
    public static int findMin(int arr[][]){
        int min=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        return min;
    }
    public static int sumCross(int arr[][]){
        int sum1=0;
        int sum2=0;
        int sum=0;
        if (arr.length==arr[0].length){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (i==j){
                        sum1+=arr[i][j];
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    sum2+=arr[i][(arr.length-1)-i];
                    break;
                }
            }
            sum=sum1+sum2;
            return sum;
        }
return sum;
    }
}

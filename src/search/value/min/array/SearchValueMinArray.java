package search.value.min.array;

public class SearchValueMinArray {
    public static void main(String[] args) {
        int[]array={2,4,6,7,1,9};
        int minArr=minValue(array);
        System.out.println("Min :"+minArr);
    }
    public static int minValue(int[]arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}

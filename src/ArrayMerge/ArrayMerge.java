package ArrayMerge;

public class ArrayMerge {
    public static void main(String[] args) {
        int[]array1={1,2,3,4,5,6};
        int[]array2={7,8,9,10};
        int[]array3=new int[array1.length+array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i]=array1[i];
        }
        System.out.println("Element array1 to array3");
        for (int e :
                array3) {
            System.out.print(e);
        }
        for (int i = 0; i <array2.length ; i++) {
            array3[array1.length+i]=array2[i];
        }
        System.out.println();
        System.out.println("arr3 : ");
        for (int e:
        array3){
            System.out.print(e);
        }
    }
}

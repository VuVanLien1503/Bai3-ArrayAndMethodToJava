package countCharOfString;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        int count=0;

        String str="hello World";
        Scanner scanner=new Scanner(System.in);
        char charInput = scanner.next().charAt(0);
        System.out.println(charInput);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==charInput){
                count++;
            }
        }
        if (count==0){
            System.out.println(" is NOT charInput "+charInput);
        }else {
            System.out.println("Find "+charInput+" :str "+str+" Count:"+count);
        }
    }
}

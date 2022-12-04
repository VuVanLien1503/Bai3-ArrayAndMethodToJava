package search.value.array;

import java.util.Scanner;

public class SearchValueArray {
    public static void main(String[] args) {
        String[] students = {"Lien","Duy","Hoang","Vu","Son","Dung","Linh","Ngoc",};
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter Student :");
        String name =scanner.nextLine();
        boolean isCheckName=false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)){
                System.out.println("Tim Thay :"+name+" : Index : "+i);
                isCheckName=true;
                break;
            }
        }
        if (!isCheckName){
            System.out.println("Not found "+ name+"arrayStudent");
        }
    }

}

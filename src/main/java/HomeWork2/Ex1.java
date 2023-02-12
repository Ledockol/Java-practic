package HomeWork2;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args)
    {
        Scanner lineScanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = "";
        str = lineScanner.next();
        lineScanner.close();
//        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        System.out.println(A);
    }
    public static boolean isPalindrome(String str){
        return str.replaceAll("\\W","")
                .equalsIgnoreCase(new StringBuilder(str.replaceAll("\\W",""))
                        .reverse().toString());
    }

}







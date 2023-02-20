package HomeWork4;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String text = inputText();
            if (text.equalsIgnoreCase( "print")) {
                for (int i = list.size() - 1; i >= 0 ; i--) {
                    System.out.println(list.get(i));
                }
            } else if (text.equalsIgnoreCase("revert")) {
                list.remove(list.size() - 2);
            } else if (text.equalsIgnoreCase("exit")) {
                break;
            } else {
                list.add(text);
            }
        }
    }
    private static String inputText() {
        String text = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите запрос: ");
        try {
            text = scanner.nextLine();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return text;
    }
}

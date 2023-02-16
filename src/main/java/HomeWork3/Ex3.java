package HomeWork3;


import java.util.*;

public class Ex3 {
    public static void main(String[] args) {

        ex1();

    }


    private static void ex1() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            arrayList.add(random.nextInt(3, 11));
        }

        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                return (x < y) ? -1 : ((x == y) ? 0 : 1);
            }
        });

        System.out.println("a" + "b");

        arrayList.sort(Integer::compare);


        System.out.println(arrayList);
    }


    public static int temp = 1;
    static void new_line(String[] args) {
        StringBuilder arrayList2 = new StringBuilder();
        StringBuilder new_line = new StringBuilder();
        System.out.println(arrayList2);

        for (int i = 0; i < arrayList2.length() - 1; i++) {
            if (arrayList2.charAt(i) != arrayList2.charAt(i + 1)) {
                new_line.append(arrayList2.charAt(i));
                if (temp != 1) {
                    new_line.append(temp);
                    temp = 0;
                }
            }
            temp++;
        }
        append_symbol(new_line, arrayList2, arrayList2.length() - 1);
        System.out.println(new_line);
    }

    static void append_symbol(StringBuilder new_line, StringBuilder arrayList2, int i) {

    }
}

package HomeWork4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Ex2 {

    public static <Num> List<Num> reverseList(List<Num> list) {
        List<Num> reverse = new ArrayList<>(list);
        Collections.reverse(reverse);
        return reverse;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list);
        List<Integer> reverse = reverseList(list);
        System.out.println(reverse);
    }
}
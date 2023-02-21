package HomeWork5;

import java.util.HashMap;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
    HashMap <List<String>, List<String>> phoneBook = new HashMap<>();

        phoneBook.put(List.of("Бубликова Юлия Андреевна"), List.of("+79648126343", "+79603216542"));
        phoneBook.put(List.of("Серебряков Сергей Михайлович"), List.of("+79645238389", "+79271176282"));
        phoneBook.put(List.of("Хмельнов Кириил Викторович"), List.of("+79667667051", "+79603232523"));
        phoneBook.put(List.of("Полянская Наталья Владиславовна"), List.of("+79313577231", "+79605976112"));
        phoneBook.put(List.of("Серебряков Виктор Михайлович"), List.of("+79577425832"));
       System.out.println(phoneBook);
    }
}

package FinalWork;

import java.util.List;
import java.util.Scanner;

public class NoteBookOne {
    public static void main(String[] args) {
        NoteBook noteBook1 = new NoteBook("Asus", 17.2, "metal", 8000, "black", "8", "128", 17853);
        NoteBook noteBook2 = new NoteBook("MSI", 16.0, "plastic", 5000, "red", "4", "64", 72613);
        NoteBook noteBook3 = new NoteBook("Asus", 14.8, "metal-plastic", 6300, "yellow", "8", "128", 52730);
        NoteBook noteBook4 = new NoteBook("Acer", 16.0, "metal", 8200, "black", "6", "128", 48155);
        NoteBook noteBook5 = new NoteBook("Lenovo", 12.0, "metal-plastic", 5100, "black", "8", "128", 92658);
        NoteBook noteBook6 = new NoteBook("Asus", 14.8, "metal", 7600, "red", "4", "64", 11745);

        List<NoteBook> notebookList = List.of(noteBook1, noteBook2, noteBook3, noteBook4, noteBook5, noteBook6);
        Scanner scannerUser = new Scanner(System.in);
        System.out.println("Выберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду\n3 - по материалу\n4 - по обьему ОЗУ\n5 - по обьему SSD");
        int choiceUserSearch = scannerUser.nextInt();
        while (choiceUserSearch < 1 || choiceUserSearch > 5) {
            System.out.println("Ошибка.\nВыберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду\n3 - по материалу\n4 - по обьему ОЗУ\n5 - по обьему SSD");
            return ;
        }

        Scanner scannerRequestUserForSearch = new Scanner(System.in);
        if (choiceUserSearch == 1) {
            System.out.println("Напишите интересующий цвет (black/red/yellow): ");
        }
        if (choiceUserSearch == 2) {
            System.out.println("Напишите интересующий бренд (Asus/MSI/Acer/Lenovo): ");
        }
        if (choiceUserSearch == 3) {
            System.out.println("Напишите интересующий материал (metal-plastic/metal/plastic): ");
        }
        if (choiceUserSearch == 4) {
            System.out.println("Напишите интересующий обьем ОЗУ (4/6/8): ");
        }
        if (choiceUserSearch == 5) {
            System.out.println("Напишите интересующий обьем SSD (64/128): ");
        }
        String requestUserForSearch = scannerRequestUserForSearch.nextLine();


        if (choiceUserSearch == 1) {
            for (NoteBook color : notebookList) {
                if (color.getColor().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(color.printInfo());
                }
            }
        } else if (choiceUserSearch == 2){
            for (NoteBook brand : notebookList) {
                if (brand.getNameBrand().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(brand.printInfo());
                }
            }
        } else if (choiceUserSearch == 3){
            for (NoteBook material : notebookList) {
                if (material.getMaterial().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(material.printInfo());
                }
            }
        } else if (choiceUserSearch == 4){
            for (NoteBook ram : notebookList) {
                if (ram.getRam().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(ram.printInfo());
                }
            }
        } else if (choiceUserSearch == 5){
            for (NoteBook ssd : notebookList) {
                if (ssd.getSsd().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(ssd.printInfo());
                }
            }
        }
        scannerUser.close();
    }
}
package FinalWork;

public class NoteBook {
    public String nameBrand;
    public double size;
    public String material;
    public int price;
    public String color;
    public String ram;
    public String ssd;
    public int articleNumber;

    public NoteBook(String nameBrand, double size, String material, int price, String color, String ram, String ssd, int articleNumber) {
        this.nameBrand = nameBrand;
        this.size = size;
        this.material = material;
        this.price = price;
        this.color = color;
        this.ram = ram;
        this.ssd = ssd;
        this.articleNumber = articleNumber;
    }
    public NoteBook() {
    }
    public String printInfo(){
        System.out.printf("Brand: %s,Material: %s,Color: %s, RAM: %s, SSD: %s", nameBrand, material, color, ram, ssd);
        return "";
    }
    public String getNameBrand() {
        return nameBrand;
    }
    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public String getRam() {
        return ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void getAppearance() {
        System.out.println(size + '"' + color + material);
    }

    public void getProduct() {
        System.out.println(nameBrand + price + "р" + articleNumber);

    }
}




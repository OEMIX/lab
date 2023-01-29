package lab_rob_6;

public class Shop implements ShopDemo, PeopleProducts.Add{
    String storage;//склад
    String mainHall;//головний зал
    String toilet;//вбиральня


    Shop(String storage, String mainHall, String toilet) {
        this.storage = storage;
        this.mainHall = mainHall;
        this.toilet = toilet;
    }

    public void main_hall(int height, int width, int length){
        System.out.println("Площа магазину : "+height*width*length);
    }


    public void showInfo() {
        System.out.println(storage);
        System.out.println(mainHall);
        System.out.println(toilet);
    }
}

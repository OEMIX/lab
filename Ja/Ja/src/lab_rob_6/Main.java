package lab_rob_6;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("Склад","головний зал","туалет");
        shop.main_hall(3, 25, 19);
        shop.showInfo();

        System.out.println();

        Parking parking = new Parking("Склад","головний зал","туалет");
        parking.main_hall(20, 30);

        System.out.println();

        PeopleProducts peopleProducts = new PeopleProducts("Лосось, Матіс, Скумбрія","Телятина, баранина, курятина","Хліб, булочки, печиво", 29);
        peopleProducts.average_amount();
        peopleProducts.typesOfMeat();
    }
}

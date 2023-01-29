package lab_rob_5;

public class Dispatch {
    Shop s = new Shop("Склад","головний зал","туалет");
    Products pro = new Products("Лосось, Матіс, Скумбрія","Телятина, баранина, курятина","Хліб, булочки, печиво");
    People p = new People(36,2,2,"Наталя","Олер");

    Shop shop;

    void call(int i){
        if (i == 1) {
            shop = s;
            shop.info();
        }else if (i == 2){
            shop = pro;
            shop.info();
        } else if (i == 3){
            shop = p;
            shop.info();
        }
    }
}

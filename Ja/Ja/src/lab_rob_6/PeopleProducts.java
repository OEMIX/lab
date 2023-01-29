package lab_rob_6;

public class PeopleProducts implements PeopleDemo{
    String fish;//риба
    String meat;//м'ясо
    String baking;//випічка

    int customers; //клієнти


    PeopleProducts(String fish, String meat, String beking, int customers) {
        this.customers = customers;
        this.fish = fish;
        this.meat = meat;
        this.baking = beking;
    }

    public void typesOfMeat() {
        System.out.println("На прилавку м'ясного відділення є : " + meat);
        System.out.println("На прилавку рибного відділення є : " + fish);
        System.out.println("На прилавку випічки є : " + baking);
    }

    public void average_amount() {
        System.out.println("Середня кількість клієнтів в магазин : "+ customers);
    }

    public interface Add{
        void showInfo();
    }

}

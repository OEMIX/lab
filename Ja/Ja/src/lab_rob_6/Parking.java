package lab_rob_6;

public class Parking extends Shop{
    Parking(String storage, String mainHall, String toilet) {
        super(storage, mainHall, toilet);
    }

    public void main_hall(int width, int length){
        System.out.println("Площа парковки : " + width*length);
    }

}

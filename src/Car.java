public class Car {

    public int year;
    public int years;
    public String model;
    public double volume;


    public Car() {
    }

    public Car(int year, String model, double volume) {
        this.year = year;
        this.model = model;
        this.volume = volume;
    }
    public void makeSignal(){
        System.out.println(this.model+"Bip Bip!");
    }
    public void move(String city){
        System.out.println("CAR "+this.model+" move"+city);

    }
    public void move(){
        System.out.println("CAR "+this.model+" move");

    }

}

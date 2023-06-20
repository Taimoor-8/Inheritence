
class vehicle{
    private String engine;
    private int wheels;
    private int seat;
    private int fuelTank;
    private String lights;

    public vehicle(String engine, int wheels, int seat, int fuelTank, String lights) {
        this.engine = engine;
        this.wheels = wheels;
        this.seat = seat;
        this.fuelTank = fuelTank;
        this.lights = lights;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeat() {
        return seat;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public String getLights() {
        return lights;
    }
}

class bike extends vehicle{

    private String handle;
    public bike(String handle, String engine, int wheels, int seat, int fuelTank, String lights) {
        super(engine, wheels, seat, fuelTank, lights);
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }

    @Override
    public String toString() {
        return "bike{" +
                "handle='" + handle + '\'' +
                "\tengine='" + getEngine() + '\'' +
                "\twheels='" + getWheels() + '\'' +
                "\tseats='" + getSeat() + '\'' +
                "\tfuelTank='" + getFuelTank() + '\'' +
                "\tlights='" + getLights() + '\'' +
                '}';
    }


}

class car extends vehicle{

    private String steering;
    private String musicSystem;
    private String airConditioner;
    private String entertainmentSystem;

    public car(String engine, int wheels, int seat, int fuelTank, String lights, String steering, String musicSystem, String airConditioner, String entertainmentSystem) {
        super(engine, wheels, seat, fuelTank, lights);
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.entertainmentSystem = entertainmentSystem;
    }

    public String getSteering() {
        return steering;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public String getEntertainmentSystem() {
        return entertainmentSystem;
    }
}

class truck extends car{

    private int container;

    public truck(String engine, int wheels, int seat, int fuelTank, String lights, String steering, String musicSystem, String airConditioner, String entertainmentSystem, int container) {
        super(engine, wheels, seat, fuelTank, lights, steering, musicSystem, airConditioner, entertainmentSystem);
        this.container = container;
    }

    public int getContainer() {
        return container;
    }
}

public class Inheritance {

    public static void main(String[] args) {

        /*bike bike = new bike("short" , "diesel" , 4 , 5 , 50 , "LED");
        System.out.println(bike.getHandle());
        System.out.println(bike);*/

        truck t = new truck("diesel" , 8 , 5 ,
                200 , "LED" , "Large" ,
                "great" , "available" ,
                "available" , 2);

        System.out.println(t.getFuelTank());
    }
}

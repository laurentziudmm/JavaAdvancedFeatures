package homeWork.exerciceTwo.exBusTruck;

public class Truck extends Vehicle {


    @Override
    public void printState() {
        System.out.println("Truck gear "+getGear() + " speed is " + getSpeed());
    }

}

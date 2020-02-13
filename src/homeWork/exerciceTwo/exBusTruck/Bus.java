package homeWork.exerciceTwo.exBusTruck;

public class Bus extends Vehicle {

    @Override
    public void printState() {
        System.out.println("Bus gear "+getGear() + " speed is " + getSpeed());    }


}

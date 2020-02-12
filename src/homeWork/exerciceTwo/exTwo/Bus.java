package homeWork.exerciceTwo.exTwo;

public class Bus extends Vehicle {

    @Override
    public void printState() {
        System.out.println("Bus gear "+getGear() + " speed is " + getSpeed());    }


}

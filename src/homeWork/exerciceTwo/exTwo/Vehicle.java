package homeWork.exerciceTwo.exTwo;

public abstract class Vehicle {
    private int speed;
    private int gear;

    public void changeGear(int newGear) {
        this.gear = this.gear + newGear;
    }

    public void speedUp(int increment) {
        this.speed = this.speed + increment;
    }

    public void applyBrakes(int decrement) {
        this.speed = this.speed - decrement;
    }

    public abstract void printState();
}

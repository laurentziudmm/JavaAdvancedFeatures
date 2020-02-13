package homeWork.exerciceTwo.exBusTruck;

public abstract class Vehicle {
    private int speed;
    private int gear;

    public void changeGear(int newGear) {
        this.gear = newGear;

    }

    public void speedUp(int increment) {
        this.speed = this.speed + increment;
    }

    public void applyBrakes(int decrement) {
        this.speed = this.speed - decrement;
    }

    public abstract void printState();

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }
}

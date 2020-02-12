package homeWork.exerciceTwo.exTwo;

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

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}

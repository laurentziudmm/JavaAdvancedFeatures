package homeWork.exerciceTwo.exTwo;

public class Main {

    public static void main(String[] args) {

        //exTwo Solved

        Truck truck = new Truck();
        truck.changeGear(2);
        truck.printState();
        truck.changeGear(3);
        truck.speedUp(3);
        truck.printState();
        truck.changeGear(1);
        truck.applyBrakes(1);
        truck.printState();

        Bus bus = new Bus();
        bus.changeGear(1);
        bus.printState();
        bus.changeGear(3);
        bus.speedUp(4);
        bus.printState();
        bus.changeGear(2);
        bus.applyBrakes(3);
        bus.printState();


    }
}


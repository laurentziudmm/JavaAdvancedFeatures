package homeWork.exerciceTwo.exThree;

public class Swimmer implements Swim,Breath {
    @Override
    public void breath() {
        System.out.println("Respiratia este accelerata!! ");
    }

    @Override
    public void swim() {
        System.out.println("Daca inoti ");

    }
}

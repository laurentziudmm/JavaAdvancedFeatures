package homeWork.exerciceTwo.exSwimWalk;

public class Walker implements Walk,Breath {
    @Override
    public void breath() {
        System.out.println("Respiratia este normala!! ");
    }

    @Override
    public void walk() {
        System.out.println("Daca mergi ");
    }
}

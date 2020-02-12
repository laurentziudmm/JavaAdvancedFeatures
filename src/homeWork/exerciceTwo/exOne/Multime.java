package homeWork.exerciceTwo.exOne;

public class Multime {

    private int[] date;
    private int dim;
    private int n;

    public Multime(int[] date) {
        this.date = date;
    }


    public void adauga(int dim) {
        this.dim = this.dim + n;

    }

    public void extrage(int dim) {
        this.dim = this.dim - n;
    }


    public void afisare() {
        System.out.println("Ati adaugat : " + n);
    }

}

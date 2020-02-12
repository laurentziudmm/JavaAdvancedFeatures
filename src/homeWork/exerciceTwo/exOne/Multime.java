package homeWork.exerciceTwo.exOne;

public class Multime {

    private int[] date;
    private int dim;
    private int n;

    public Multime(int[] date) {
        this.date = date;
    }

    public int getN() {
        return n;
    }

    public void adauga(int n) {
        this.dim = this.dim + n;

    }

    public void extrage(int n) {
        this.dim = this.dim - n;
    }


    public void afisare() {
        System.out.println("Aveti : " + date);
    }

}

package homeWork.exerciceTwo.exOne;

public class Multime {

    private int[] date;
    private int dim;
    private int n;


    public Multime(int dim) {
        this.dim = dim;
        this.date = new int[dim];
        this.n = 0;
    }

    public void adauga(int n) {
        this.dim = this.dim + n;

    }

    public void extrage(int n) {
        this.dim = this.dim - n;
    }


    public void afisare() {
        System.out.println("Aveti : " + dim);
    }

}

package homeWork.exerciceTwo.exMultime;

public class Multime {

    private int[] date;
    private int dim;
    private int n;
    int nr = 0;


    public Multime(int dim) {
        this.dim = dim;
        this.date = new int[dim];
        this.n = 0;
    }

    public void adauga(int n) {
        date[nr++] = n;
    }


    public void extrage(int n) {
        for (int p = 0; p < date.length - 1; p++) {
            if (n == date[p]) {
                date[p] = date[p + 1];
                n = date[p];
            }
        }

    }

    public void afisare() {
        for (int i = 0; i < date.length; i++) {
            System.out.print(" " + date[i]);
        }
    }
}

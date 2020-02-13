package homeWork.exerciceTwo.exMultime;

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

        date[n++] = n;
    }


    public void extrage(int n) {
        date[n--] = n;

    }


    public void afisare() {
        for (int i = 0; i < date.length; i++) {
            System.out.print(" " + date[i]);
        }

    }
}

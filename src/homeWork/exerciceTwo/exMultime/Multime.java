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

        int[] newArray = new int[date.length + 1];

        for(int i = 0; i < date.length;i++) {
            if (date[i] != n && date[i] <= dim) {
                newArray[i] = date[i];
            }
        }
        newArray[date.length-1] = n;
        date = newArray;
    }

    public void extrage(int n) {
        for (int i = 0; i < date.length - 1; i++) {
            if (n == date[i]) {
                date[i] = date[i + 1];
                n = date[i];
            }
        }
    }

    public void afisare() {
        for (int i = 0; i < date.length; i++) {
            if (date[i] != 0) {
                System.out.print(" " + date[i]);
            }
        }

    }
}
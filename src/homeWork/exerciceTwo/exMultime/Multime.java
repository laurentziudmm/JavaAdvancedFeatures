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

    public void adauga(int number) {
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (date[i] == number) {
                System.out.println("Number " + date[i] + " already exists!");
                found = true;
            }
        }
        if (found == false) {
            date[n] = number;
            n++;
        }
        if (n >= date.length) {
            System.out.println("Array full!!!");
        }
    }


    public void extrage(int number) {
        for (int i = 0; i < n; i++) {
            if (date[i] == number) {
                date[i] = date[i + 1];
                n--;
            }
        }
    }


    public void afisare() {
        for (int i = 0; i < n; i++) {
            System.out.print(date[i] + " ");
        }
        System.out.println();
    }

}
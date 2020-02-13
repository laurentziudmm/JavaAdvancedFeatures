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
        //vector initial
        int[] oldArray = new int[dim];

        //valoare noua
        int newValue = n;

        //construim noul vector
        int[] newArray = date;

        //copiem valorile existent
        for (int i = 0; i < oldArray.length; i++) {


            //adaugam valoarea noua
            newArray[newArray.length - n] = newValue;
        }
        //copiem referinta noului vector
        //vechiul vector va fi sters de Garbage Collector
        this.date = newArray;
    }

    public void extrage(int n) {
        //vector initial
        int[] oldArray = new int[dim];

        //valoare noua
        int newValue = n;

        //construim noul vector
        int[] newArray = date;

        for (int i = newValue; i < oldArray.length; i++) {
            //adaugam valoarea noua
            newArray[newArray.length - n] = newValue;
        }
        this.date = newArray;
    }


    public void afisare() {
        for (int i = 0; i < date.length; i++) {
            System.out.print(" " + date[i]);
        }

    }
}

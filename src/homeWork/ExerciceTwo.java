package homeWork;

public class ExerciceTwo {

    /**
     * 1.Să se implementeze clasa Multime, care reprezintă o mulţime de întregi.
     *
     * Clasa va conţine următoarele câmpuri private:
     * -Int[] date – array de numere.
     *
     * Se va initializa în constructor;
     *
     * -int dim – dimensiunea vectorului date;
     * totodată reprezintă numărul maxim de elemente din mulţime;
     *
     * -int n – numărul curent de elemente din mulţime;
     *
     * în orice moment de timp, elementele mulţimii vor fi primele n elemente din vectorul date.
     *
     * Pe parcursul existenţei mulţimii, numărul n şi elementele din date se pot modifica,
     * dar câmpul dim rămâne neschimbat.
     *
     * Membrii publici:
     *
     * - constructorul fara parametri care iniţializează câmpurile private ale mulţimii;
     * dimensiunea maximă a mulţimii va fi o valoare oarecare prestabilită.
     * Sa zicem valoarea 10;
     *
     * -constructorul cu un parametru pentru câmpul dim, reprezentând dimensiunea maximă a mulţimii;
     * - metoda void adauga(int) care adaugă un element în mulţime;
     *
     * în cazul în care elementul deja există, mulţimea rămâne nemodificată;
     * în cazul în care vectorul date este plin, se va afişa un mesaj de eroare;
     *
     * -metoda void extrage(int) care extrage un element din mulţime;
     *
     * în cazul în care mulţimea nu conţine elementul, ea rămâne neschimbată;
     * -metoda void afisare() care afişează mulţimea.
     *
     * Folositi urmatoarea secventa de cod pentru a testa(se va scrie in metoda statica main(...)):
     * Multime m = new Multime(10);
     * m.adauga(4);
     * m.adauga(3);
     * m.afisare();
     * m.extrage(4);
     * m.extrage(4);
     * m.afisare();
     * m.adauga(9);
     * m.adauga(2);
     * m.adauga(2);
     * m.afisare();
     *
     *
     *
     * 2.Creaza o clasa abstracta Vehicle care are urmatorii membrii private:
     * -Int speed: viteza cu care se deplaseaza vehiculul
     * -Int gear: treapta de viteza
     *
     * Clasa are urmatoarele metode:
     * -Void changeGear(int newGear):
     * metoda ce seteaza membrul privat gear cu parametrul primit  ce reprezinta noua treapta de viteza a vehiculului
     *
     * -Void speedUp(int increment):
     * metoda ce aduca parametrul primit de metoda la viteza curenta a vehiculului
     *
     *
     * -Void applyBrakes(int decrement):
     * metoda ce scade viteza vehiculului cu valoarea primita prin parametrul metodel
     *
     * Clasa are o metoda abstracta:
     * -Void printState(): metoda care afiseaza starea obiectului
     *
     *
     * Creati 2 clase Truck si Bus care extind  clasa abstracta Vehicle.
     *
     * Ambele clase treebuie sa implementeze metoda abstracta printState().
     *
     * Implementearea sa afiseze un mesaj sugestiv pentru fiecare clasa, de exemplu:
     *
     * “Truck state: ....” Sau “Bus state:....”.
     *
     * Testate codul folosind urmatoarea secventa de cod:
     *
     * Truck  truck = newTruck();
     * truck.changeGear(2);
     * truck.speedUp(3);
     * truck.applyBrakes(1);
     * truck.printStates();
     * Bus bus = newBus();
     * bus.changeGear(1);
     * bus.speedUp(4);
     * bus.applyBrakes(3);
     * bus.printStates();
     *
     *
     * 3.
     * A swimmer can swim and breath.
     * A walker can walk and breath.
     *
     * Pornind de la cele 2 propozitii proiecteaza folosind clase si interfete.
     *
     * a.Creaza interfata Swim ce contine metoda void swim()
     * b.Creaza interfata Breath ce contine metoda void breath()
     *
     * c.Creaza interfata Walk ce contine metoda void walk()
     *
     * d.Creaza clasa Swim ce implementeaza interfetele Swim si Breath si implementeaza metodele.
     *
     *
     * Implementarea trebuie sa afiseze un mesaj sugestiv la consola.
     *
     * e.Creaza clasa Walk ce implementeaza interfetele Walk si Breath si implementeaza metodele.
     *
     * Implementarea trebuie sa afiseze un mesaj sugestiv la consola.
     *
     *
     * f.In metoda main() instantiaza un obiect de tipul Walk si un obiect de tipulSwimmer.
     *
     * Pentru fiecare obiect apeleaza metodele lui si urmareste ce se afiseaza la consola.
     */
}

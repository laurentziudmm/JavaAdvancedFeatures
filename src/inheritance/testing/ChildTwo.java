package inheritance.testing;

public class ChildTwo extends Child {

    public void test () {


        //am mostenit testAccesorsModifiers si din clasa Child si din clasa Parent prin clasa Child
        //dar default nu mai apare ever
        super.testAccesorsModifiers();
        super.pMethod();
        String a = super.pField;

    }

}

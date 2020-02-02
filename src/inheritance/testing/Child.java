package inheritance.testing;

import inheritance.Parent;

public class Child extends Parent {

    public void testAccesorsModifiers () {
        //default nu mai apar ca am iesit inafara pachetului
        //apar doar protected

        String a =super.pField;
        super.pMethod();

    }
}

package inheritance;

public class MainParent {
    public static void main(String[] args) {

        Parent parent = new Parent();
        String a = parent.pField;
        String b = parent.dField;
        parent.dMethod();
        parent.pMethod();

    }
}

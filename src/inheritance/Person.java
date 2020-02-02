package inheritance;

public abstract class Person {

    private String name;

    public Person (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void walk(){
        System.out.println("Person " + name + " is walking!");
    }

//    //Overloading
//    public void walk(String a, int b){
//        System.out.println("Person " + name + " is walking!");
//    }
//    public void walk(int b , String a){
//        System.out.println("Person " + name + " is walking!");
//    }

    @Override
    public String toString () {
        return "Name " + name;
    }

    public abstract void  eat();
}


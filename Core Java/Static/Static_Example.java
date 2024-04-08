class Person {
    String name;
    int age;
    static String test;

    static {
        test = "test";
    }
    // the value is shared among the objects, as a class member

    public static void teste() {
        System.out.println("static function " + test);
    }
}

public class Static_Example {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        System.out.println(p1.test + " " + p2.test);

        Person.teste();
        //p1.teste(); -> static functions should be called only with the class, not objects
    }
}
public class Main {
    public static void main(String[] args) {
        new Y().method(1337.0);

    }

}

class X {

    void method(int a) {

        System.out.println("FIRST");

    }

    void method(double d) {

        System.out.println("SECOND");

    }

}

class Y extends X {

    @Override

    void method(double d) {

        System.out.println("THIRD");

    }

}

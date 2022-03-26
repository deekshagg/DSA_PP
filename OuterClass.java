public class OuterClass {
    private int a = 8;

    private int b = 11;

    OuterClass() {

        NestedOne nestedOne = new NestedOne (4);

        a = a - 10;

    }
}

class NestedOne {

NestedOne(int y) { 
    Nested Two nested Two = new NestedTwo (y);

nested

       Two.m hodTwo (y, a);

a = a + b - y;

}

private void methodA(int z) {

    System.out.print("-x" + a + z + "y" + (bz));

}
}
class Nested Two{

NestedTwo(int i) {

a = a - i;

b = b + i;

}

            private void methodTwo(int x, int z) {

                if (x < 5) {
                    a = a + x + b;

                }
                b = b + z;

                System.out.print("-x" + a + "-y" + b);

            }

        }

    public static void main(String[] args) { 
        NestedOne nestedOne new OuterClass().new NestedOne (2);
    }
}
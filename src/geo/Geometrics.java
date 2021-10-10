package geo;

public class Geometrics {

    // private static double x = 10.0; >>> to int
    // private static double y = 5.0; >>> to int
    // private static double z = 3.0; >>> to int
    // private static int x1 = 8;
    // private static int y1 = 7;
    // private static int z1 = 10;
    // private static int x2 = 100;
    // private static int y2 = 57;
    // private static int z2 = 129;
    // private static int x3 = 45;
    // private static int y3 = 89;
    // private static int z3 = 69;

    static int[] x = { 10, 8, 100, 45 };
    static int[] y = { 5, 7, 57, 89 };
    static int[] z = { 3, 10, 129, 69 };

    public static void main(String[] args) {

        squareArea(x, "x", 3);
        squareArea(y, "y", 1);
        squarePerimeter(x, "x", 3);
        squarePerimeter(y, "y", 1);
        rectangleArea(x, "x", y, "y", 4);
        rectanglePerimeter(x, "x", y, "y", 4);
        System.out.println("We can also calculate some volumes");
        zoneSphere(x[0], y[0], z[0]);
        sphereCylinder(z[0]);
        ungula(x[3], y[3]);
    }

    public static void squareArea(int[] array, String buchstabe, int reihe) {
        System.out.println("Square area");
        for (int i = 0; i < reihe; i++) {
            System.out.println(buchstabe + i + " * " + buchstabe + i + " = " + array[i] * array[i]);

        }
        System.out.println("");
    }

    public static void squarePerimeter(int[] array, String buchstabe, int reihe) {
        System.out.println("Square perimeter");
        for (int i = 0; i < (reihe); i++) {
            System.out.println("4 * " + buchstabe + i + " = " + 4 * array[i]);

        }
        System.out.println("");
    }

    public static void rectangleArea(int[] array0, String buchstabe, int[] array1, String buchstabe2, int reihe) {
        System.out.println("Rectangle area");
        for (int i = 0; i < (reihe); i++) {
            System.out.println(buchstabe + i + " * " + buchstabe2 + i + " = " + array0[i] * array1[i]);

        }
        System.out.println("");
    }

    public static void rectanglePerimeter(int[] array0, String buchstabe, int[] array1, String buchstabe2, int reihe) {
        System.out.println("Rectangle perimeter");
        for (int i = 0; i < (reihe); i++) {
            System.out.println(buchstabe + i + " + " + buchstabe2 + i + " = " + (array0[1] + array1[i]) * 2);

        }
        System.out.println("");
    }

    public static void zoneSphere(int x, int y, int z) {
        System.out.println("Zone of a sphere");

        double v = (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
        System.out.println(v);

        System.out.println("");
    }

    public static void sphereCylinder(int z) {
        System.out.println("Sphere with cylinder");
        System.out.println(Math.PI * Math.pow(z, 3) / 6);
    }

    public static void ungula(int array0, int array1) {
        System.out.println("Ungula");
        System.out.println((double) (2 * array0 * array1) / 3);

    }

}

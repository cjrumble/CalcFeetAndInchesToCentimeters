public class Main {
    public static void main(String[] args) {
        double a = CalcFeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(0, 1);
        if (a < 0.0) {
            System.out.println("Invalid parameters!");
        } else {
            System.out.println(a);
        }


        double b = CalcFeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(7, 5);
        if (b < 0.0) {
            System.out.println("Invalid parameters!");
        } else
            System.out.println(b);


        double c = CalcFeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(0, -1);
        if (c < 0.0) {
            System.out.println("Invalid parameters!");
        } else
            System.out.println(c);


        double d = CalcFeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(0, 13);
        if (d < 0.0) {
            System.out.println("Invalid parameters!");
        } else
            System.out.println(d);


        double e = CalcFeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(3, 11);
        if (e < 0.0) {
            System.out.println("Invalid parameters!");
        } else
            System.out.println(e);


        double f = CalcFeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(13);
        if (f < 0.0) {
            System.out.println("Invalid parameters!");
        } else
            System.out.println(f);


        double g = CalcFeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(11);
        if (g < 0.0) {
            System.out.println("Invalid parameters!");
        } else
            System.out.println(g);


    }
}

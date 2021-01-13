/* ***************************************************************************
This is a comment about the CalcFeetAndInchesToCentimeters class/methods.
*************************************************************************** */

public class CalcFeetAndInchesToCentimeters {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            // Moved this. If -1 passed to MAIN, use to throw error.
            // System.out.println("Invalid feet or inches parameter!");
            return -1;
        }
        double centimeters;
        centimeters = ((feet * 12) + inches) * 2.54;
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            // Moved this. If -1 passed to MAIN, use to throw error.
            // System.out.println("Invalid feet or inches parameter!");
            return -1;
        }
        double centimeters;
        centimeters = inches * 2.54;
        return centimeters;
    }

}

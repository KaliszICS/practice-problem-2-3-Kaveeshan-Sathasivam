
public class PracticeProblem {

	public static void main(String[] args) {
        // Example calls — students can test with different values
        circleArea(5.0);
        minutesToHours(100);
        simpleInterest(200.0, 10.0, 8);
        hypotenuse(70.0, 1.75);
    }

    /**
     * Function 1: Calculate the area of a circle
     * Input: radius (double)
     * Output: area (double)
     */
    public static double circleArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    /**
     * Function 2: Convert minutes to total hours and remaining minutes
     * Input: totalMinutes (int)
     * Output: formatted String e.g. "2 hours and 30 minutes"
     */
    public static String minutesToHours(int totalMinutes) {
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        return hours + " hours and " + minutes + " minutes";
    }

    /**
     * Function 3: Calculate the simple interest earned
     * Inputs: principal (double), annualRate (double as a percent e.g. 5.0 for 5%),
     *         years (int)
     * Output: interest earned (double)
     */
    public static double simpleInterest(double principal, double annualRate, int years) {
        double interest = principal * (annualRate / 100.0) * years;
        return interest;
    }

    /**
     * Function 4: Calculate the hypotenuse of a right triangle
     * Inputs: sideA (double), sideB (double)
     * Output: hypotenuse (double)
     */
    public static double hypotenuse(double sideA, double sideB) {
        double hypotenuse = Math.sqrt(sideA * sideA + sideB * sideB);
        return hypotenuse;
    }
}


    

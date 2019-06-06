//Karthik's comment
/*
I learned that lamda functions are basically just JS arrow functions.
In addition, I learned that in order to use a lamda function you need an interface
Finally, I learned that printf lets you round a flout when you use %f
*/

public class Main {
    public static void main(String[] args) {
        PerfectSquareInterfacez interfac = (int num) -> Math.sqrt(num) == Math.round(Math.sqrt(num));
        System.out.println(interfac.PerfectSquareInterface(7));
        PrintQuotient hi = (float a, float b) -> System.out.printf("%.3f / %.3f = %.3f", a, b, a / b);
        hi.printQuotient(1, 3);
    }
}
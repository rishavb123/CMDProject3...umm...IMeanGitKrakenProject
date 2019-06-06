// Rishav's comment
/*
I learned that lambda functions are JS arrow functions with a - instead of a =
I learned that Git Kraken has a feature that it automatically turns on the fan of my computer while opening
I also learned that when you clone from a tinyurl git will not recognize the remote as the correct remote but it will still connect to the correct remote
I also learned that you can truncate floats using %.3f to only show 3 decimal points
*/

public class Main {
    public static void main(String[] args) {
        PerfectSquareInterfacez interfac = (int num) -> Math.sqrt(num) == Math.round(Math.sqrt(num));
        System.out.println(interfac.PerfectSquareInterface(7));
        PrintQuotient hi = (float a, float b) -> System.out.printf("%.3f / %.3f = %.3f", a, b, a / b);
        hi.printQuotient(1, 3);
    }
}
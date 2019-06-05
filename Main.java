public class Main {
    public static void main(String[] args) {
        PerfectSquareInterfacez interfac = (int num) -> Math.sqrt(num) == Math.round(Math.sqrt(num));
        System.out.println(interfac.PerfectSquareInterface(7));
        PrintQuotient hi = (float a, float b) -> System.out.printf("%.3f / %.3f = %.3f", a, b, a / b);
        hi.printQuotient(1, 3);
    }
}
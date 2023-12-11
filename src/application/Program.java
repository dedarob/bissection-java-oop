package application;
import calculus.Calculus;


public class Program {

    public static void main(String[] args) {
        // Create an instance of the Product class
        Calculus calculus = new Calculus();

        // Call the toString() method and print the result
        System.out.println(calculus.getColch());
        int i = 0;
        while (calculus.getB() - calculus.getA() >= calculus.getErrorMargin() && i<=100) {
            double a = calculus.getA();
            double b = calculus.getB();
            double c = (a + b) / 2;

            double funcA = calculus.getFuncA(a);
            double funcB = calculus.getFuncB(b);
            double funcC = calculus.getFuncC(c);

            System.out.println(calculus.getOrg());

            if (funcA * funcC > 0) {
                calculus.setA(c);
            }

            if (funcB * funcC > 0) {
                calculus.setB(c);
            }
            if (i==99) {
                System.out.println("Infinite loop detected, execution aborted.");
                System. exit(0);
            }
            System.out.println(calculus.getColch());
            i++;
        }

        System.out.println(calculus.getResult());
    }
}

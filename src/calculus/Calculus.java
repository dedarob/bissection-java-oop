package calculus;

public class Calculus {
    double a = 0.5;
    double b = 1;
    double c = (a + b) / 2;
    double errorMargin = 0.01;

    public void updateValues(double newA, double newB) {
        this.a = newA;
        this.b = newB;
        this.c = (newA + newB) / 2;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    public double getErrorMargin() {
        return errorMargin;
    }

    public void setErrorMargin(double errorMargin) {
        this.errorMargin = errorMargin;
    }


    public double getFuncA(double a) {
        return Math.pow(a, 2) + Math.log(a);
    }

    public double getFuncB(double b) {
        return Math.pow(b, 2) + Math.log(b);
    }

    public double getFuncC(double c) {
        return Math.pow(c, 2) + Math.log(c);
    }


    public String getColch() {
        return "["
                + String.format("%.3f", a)
                + " ; "
                + String.format("%.3f", b)
                + "]";
    }
    public String getOrg() {
        return "\nf(a) = "
                + String.format("%.3f\n", getFuncA(getA()))
                + "f(b) = "
                + String.format("%.3f\n", getFuncB(getB()))
                + "c = "
                + String.format("%.3f\n", (a + b) / 2)
                + "f(c) = "
                + String.format("%.3f\n", getFuncC(getC()));
    }
    public String getResult() {
        return String.format("%.3f", b)
                + " - "
                + String.format("%.3f", a)
                + " = "
                + String.format("%.3f\n", (b - a))
                + "Resultado: "
                + String.format("%.3f\n", (a + b) / 2);
    }
}

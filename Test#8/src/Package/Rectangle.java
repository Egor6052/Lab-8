package Package;

import java.io.Serializable;

public class Rectangle implements Serializable {
    static double A;
    static double B;
    static double C;
    static double D;


    public void setRectangle(Rectangle rectangle) {
    }
    Rectangle(Rectangle rectangle) {
        this.setRectangle(rectangle);
    }

    public Rectangle() {
        this.setA(A);
        this.setB(B);
        this.setC(C);
        this.setD(D);
    }

    public static double getA() {
        return A;
    }

    public static double getB() {
        return B;
    }

    public static double getC() {
        return C;
    }

    public static double getD() {
        return D;
    }

    public double setC(double C) {
        return C;
    }

    public double setA(double A) {
        return A;
    }

    public double setB(double B) {
        return B;
    }

    public double setD(double D) {
        return D;
    }

    public double Perimeter() // Периметр
    {
        return ((A * B) + (B * C) + (C * D) + (D * A));
    }

    public double AB() {
        return A + B;
    }

    public double BC() {
        return B + C;
    }

    public double CD() {
        return C + D;
    }

    public double DA() {
        return D + A;
    }

    public double Area() {
        return (((A + B) * (B + C)) / 2);
    }


    @Override
    public String toString() {
        return "Ваша фигура:\n" +
                "Периметр = " + Perimeter() + "\n" +
                "Сторона АB = " + Correct.formatDouble(AB()) + "\n" +
                "Сторона ВC = " + Correct.formatDouble(BC()) + "\n" +
                "Сторона СD = " + Correct.formatDouble(CD()) + "\n" +
                "Сторона DA = " + Correct.formatDouble(DA()) + "\n" +
                "Площадь = " + Correct.formatDouble(Area()) + "\n" +
                "Диагональ BD = " + Correct.formatDouble(Math.sqrt(AB() * CD() + BC() * DA())) + "\n" +
                "Диагональ AC = " + Correct.formatDouble(Math.sqrt(BC() * BC() + CD() * CD())) + "\n\n\n";
    }

}

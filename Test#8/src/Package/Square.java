package Package;

public class Square extends Rectangle {
    static double square;

    Square(Square square) {
        this.setSquare(square);
    }

    public Square() {
        this.setA(A);
        this.setB(B);
        this.setC(C);
        this.setD(D);
    }

    public void setSquare(Square square) {
        if ((A + B) == (B + C)) {
            Square.square = 1;
        } else {
            Square.square = 0;
        }
    }

    @Override
    public String toString() {
        if (square == 1) {
            return "\nКвадрат --> " + "A (" + Correct.formatDouble(A) + ")" + " + " + "B (" + Correct.formatDouble(B) + ")" + " = " + "B (" + Correct.formatDouble(B) + ")" + " + " + "C (" + Correct.formatDouble(C) + ")";
        } else {
            return "\nНе квадрат --> " + "A (" + Correct.formatDouble(A) + ")" + " + " + "B (" + Correct.formatDouble(B) + ")" + " не равно " + "B (" + Correct.formatDouble(B) + ")" + " + " + "C (" + Correct.formatDouble(C) + ")";
        }
    }
}
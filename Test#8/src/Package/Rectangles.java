package Package;

import java.util.Arrays;

public class Rectangles {
    private final Rectangle[] rectangles;

    public Rectangles(int length) {
        this.rectangles = new Rectangle[length];
    }

    public Rectangle[] getRectangles() {
        return rectangles;
    }


    public void setRectangleAt(int index, Rectangle rectangle) {
        rectangles[index] = rectangle;
    }

    public int maxSquare() {
        int maxIndex = 0;
        for (int i = 0; i < rectangles.length; i++) {
            if (rectangles[maxIndex].Area() < rectangles[i].Area()) {

                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public int minSquare() {
        int minIndex = 0;
        for (int i = 0; i < rectangles.length; i++) {
            if (rectangles[minIndex].Area() > rectangles[i].Area()) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    @Override
    public String toString() {
        return "Rectangles {" +
                "rectangles = " + Arrays.toString(rectangles) +
                '}';
    }
}

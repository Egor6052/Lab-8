package Package;
import java.io.*;
import java.util.Scanner;

public class Main {
    /** Вариант №12
     *
     * Реализовать в отдельном Классе хранение массива в виде списка (тип List / ArrayList)
     * объектов экземпляров-класса, созданного в предыдущем задании, а так же все сопутствующие
     * методы для поиска и обработки его элементов (обязательно должны возвращать результат, как экземпляр Класса),
     * согласно заданию (для своего варианта).
     * /------------------------------------------------------------------------------------------------------
     * Задание №8
     * Реализовать сериализацию/десериализацию данных в файл/из файла на диске для Задания №6
     * в виде отдельного класса с методами Save и Load.
     * Использовать независимых 2 способа: нативную Java-сериализацию и любую внешнюю библиотеку.
     * Предусмотреть автоматическое создание новой резервной копии файла данных при завершении работы программы,
     * имя файла - метка времени.
     * Реализовать восстановление данных из последней созданной копии при запуске.
     * В начале каждого метода ОБЯЗАТЕЛЬНО добавить комментарии разработчика.
     */
    public static void Task8() {
        System.out.println("Семенов Егор АТ-212, Вариант №12");
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Task8();

        Square square = new Square();
        Squares squares;
        Rectangle rectangle = new Rectangle();
        Rectangles rectangles;
//-------------------------------------------------------------------
        System.out.println("Введите количество четырёхугольников: ");
        int M = new Scanner(System.in).nextInt();
        rectangles = new Rectangles(M);

        for (int i = 0; i < M; i++) {
            Rectangle.A = Math.ceil(Math.random() * 10);
            Rectangle.B = Math.ceil(Math.random() * 10);
            Rectangle.C = Math.ceil(Math.random() * 10);
            Rectangle.D = Math.ceil(Math.random() * 10);

            rectangle = new Rectangle(rectangle);
            rectangles.setRectangleAt(i, rectangle);
            rectangle = new Rectangle(rectangle);
            System.out.println(rectangle);
        }
//        /**
//         * Выполняю запись в файл;
//         */
//        FileOutputStream fileOutputStream = new FileOutputStream("RectangleFle.txt");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(rectangle);
//        objectOutputStream.close();
//        /**
//         * Выполняю чтение из файла;
//         */
//        FileInputStream fileInputStream = new FileInputStream("RectangleFle.txt");
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//        Rectangle newRectangle = (Rectangle) objectInputStream.readObject();
//        objectInputStream.close();
//        System.out.println("-------------->" + rectangle);


//-------------------------------------------------------------------
        System.out.println("Введите количество квадратов: ");
        int N = new Scanner(System.in).nextInt();
        squares = new Squares(N);

        for (int i = 0; i < N; i++) {
            square.A = Math.ceil(Math.random() * 10);
            square.B = Math.ceil(Math.random() * 10);
            square.C = Math.ceil(Math.random() * 10);
            square.D = Math.ceil(Math.random() * 10);

            square = new Square(square);
            squares.setSquareAt(i, square);
            square = new Square(square);
            System.out.println(square);
        }
        //четырёхугольник с максимальной и минимальной площадью;
        System.out.println("\nЧетырёхугольник с максимальной площадью: \n\n" + rectangles.getRectangles()[rectangles.maxSquare()]);
        System.out.println("\nЧетырёхугольник с минимальной площадью: \n\n" + rectangles.getRectangles()[rectangles.minSquare()]);

    }

}

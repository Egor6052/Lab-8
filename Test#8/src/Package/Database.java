package Package;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Database {
    public ArrayList<Rectangle> rectangles;

    private final List<Rectangle> rectangleList;
    private Rectangle rectangle;

    public Database(){
        rectangleList = new ArrayList<>();
    }
    /**
     * Добавление объекта;
     * @param rectangle
     * @return
     */
    public boolean add(Rectangle rectangle){
        return rectangleList.add(rectangle);
    }
    /**
     * Получение объекта;
     * @param index
     * @return
     */
    public Rectangle get(int index){
        return this.rectangleList.get(index);
    }

    /**
     * Удаление объекта;
     * @param index;
     */

    public Rectangle remove(int index){
        return this.rectangleList.remove(index);
    }

    @Override
    public String toString(){
        return "Database" + Arrays.toString(new ArrayList[]{rectangles});
    }

    /**
     * Сохранение файла;
     * @return
     */

    public void save(String filename) throws IOException {
        FileWriter outStream = new FileWriter(filename);
        BufferedWriter bw = new BufferedWriter(outStream);
        for (Rectangle rectangle : rectangles){
            try {
                bw.write(String.valueOf(rectangle));
                bw.write(System.lineSeparator());
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        bw.close();
        outStream.close();
    }

    /**
     * Загрузка файла;
     * @param filename
     * @throws IOException
     */
    public void load(String filename) throws IOException{
        this.clear();
        Scanner scanner = new Scanner(new FileReader(filename));
        double rec = -1;

        while (scanner.hasNextLine()){
            rec = Double.parseDouble(scanner.nextLine());
            this.rectangleList.add(new Rectangle(rectangle));
        }
        scanner.close();
    }

    /**
     * Сериализация;
     * @param filename
     */
    public void serialize(String filename){
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this.rectangles);
            out.close();
            fileOut.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }

    /**
     * Десериализация;
     * @param filename
     */
    public void deserialize(String filename){
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            this.rectangles = (ArrayList<Rectangle>) in.readObject();
            in.close();
            fileIn.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        catch (ClassNotFoundException c){
            System.out.println("Square class not found");
            c.printStackTrace();
        }

    }

    /**
     *  Очистка БД;
     */
    private void clear() {
        this.rectangleList.clear();
    }

//    //Нахожу элемент с максимальной и минимальной площадью;
//    public double maxSquare(){
//        double MAX = 0;
//        for (Rectangle rectangle : rectangles){
//            if(MAX < rectangle.Area()){
//                MAX = rectangle.Area();
//            }
//        }
//        return MAX;
//    }
//    public double minSquare() {
//        double MIN = 0;
//        for(Rectangle rectangle : rectangles){
//            if(MIN < rectangle.Area()){
//                MIN = rectangle.Area();
//            }
//        }
//        return MIN;
//    }
//    public void setRectangles(Rectangle[] rectangles) {
//        this.rectangles = rectangles;
//    }
}

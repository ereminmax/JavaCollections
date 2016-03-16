/*
 * Operation op = createOperation(value0, value1, value2);
 if (op.getClass().equals(Devide.class)) {
 System.out.println("Деление");
 }
 System.out.println(op.execute());
 }

 private static Operation createOperation(double value0, double value1, char value2) {
 switch (value2) {
 case '+':
 return new Sum(value0, value1);
 case '-':
 return new Minus(value0, value1);
 case '/':
 return new Devide(value0, value1);
 case '*':
 return new Mult(value0, value1);
 default:
 return null;
 }
 }
 */

import java.io.*;
import java.util.*;

/**
 *
 * @author Masha
 */
public class CollectionsTask1 {

    private Scanner sc = new Scanner(System.in);
    private int ch;
    private List<Shape> list = new ArrayList<>();
    private Map<Class, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        new CollectionsTask1().justDoIt();
    }

    private void justDoIt() {
        while (true) {
            System.out.println("Введите 0 Выход\n"
                    + "Введите 1 Создать\n"
                    + "Введите 2 Площадь\n"
                    + "Введите 3 Удалить\n");

            ch = sc.nextInt();

            switch (ch) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    create();
                    break;
                case 2:
                    getSquare();
                    break;
                case 3:
                    delete();
                    break;
            }
        }
    }

    private void create() {
        System.out.println("Введите a и b\n");
        int a = sc.nextInt();
        int b = sc.nextInt();

        showMessage();

        switch (ch) {
            case 1:
                list.add(new Square(a, b));
                addMap(Square.class);
                break;
            case 2:
                list.add(new Circle(a, b));
                addMap(Circle.class);
                break;
            case 3:
                list.add(new Triangle(a, b));
                addMap(Triangle.class);
                break;
            case 4:
                list.add(new Ellips(a, b));
                addMap(Ellips.class);
                break;
        }
    }
    private void addMap(Class className) {
        Integer value = map.get(className);

        if (value == null) {
            map.put(className, 1);
        } else {
            value++;
            map.put(className, value);
        }
    }

    private void getSquare() {
        showMessage();

        switch (ch) {
            case 1:
                findShape(Square.class);
                break;
            case 2:
                findShape(Circle.class);
                break;
            case 3:
                findShape(Triangle.class);
                break;
            case 4:
                findShape(Ellips.class);
                break;
        }
    }

    private void delete() {
        showMessage();

        switch (ch) {
            case 1:
                removeShape(Square.class);
                break;
            case 2:
                removeShape(Circle.class);
                break;
            case 3:
                removeShape(Triangle.class);
                break;
            case 4:
                removeShape(Ellips.class);
                break;
        }
    }

    private void findShape(Class shapeName) {
        int k = 0;

        for (Shape s : list) {
            if (s.getClass().equals(shapeName)) {
                System.out.println("Площадь " + s.getName() + " равна "
                        + s.getSquare());
                k++;
            }
        }

        System.out.println("Размер коллекции: " + list.size());

        for (Map.Entry entry : map.entrySet()) {
            Class key = (Class)entry.getKey();
            Integer value = (Integer)entry.getValue();
            System.out.println("Всего объектов класса " + key + ": " + value);
        }
    }

    private void removeShape(Class shapeName) {
        Boolean flag = false;

        for (Shape s : list) {
            if (s.getClass().equals(shapeName)) {
                list.remove(s);
                flag = true;
                break;
            }
        }

        if (!flag) System.out.println("В коллекции больше нет таких объектов");
    }

    private void showMessage() {
        System.out.println("Введите 1 Квадрат\n"
                + "Введите 2 Круг\n" +
                "Введите 3 Треугольник" +
                "Введите 4 Эллипс");

        this.ch = sc.nextInt();
    }
}

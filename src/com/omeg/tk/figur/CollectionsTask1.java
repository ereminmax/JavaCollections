package com.omeg.tk.figur;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 *
 * @author Masha
 */
public class CollectionsTask1 {

    private Scanner sc = new Scanner(System.in);
    private int ch;
    private List<Shape> list = new ArrayList<>();
    private Map<Class, Integer> map = new HashMap<>();

    JFrame window;

    public static void main(String[] args) {
        new CollectionsTask1().justDoIt();
    }

    private void justDoIt() {
        while (true) {
            System.out.println("Введите 0 Выход\n"
                    + "Введите 1 Создать\n"
                    + "Введите 2 Площадь\n"
                    + "Введите 3 Удалить\n"
                    + "Введите 4 Нарисовать");

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
                case 4:
                    draw();
                    break;
            }
        }
    }

    private void draw() {
        showMessage();

        switch (ch) {
            case 1:
                drawShape(Square.class);
                break;
            case 2:
                drawShape(Circle.class);
                break;
            case 3:
                drawShape(Triangle.class);
                break;
            case 4:
                drawShape(Ellips.class);
                break;
        }
    }

    private void drawShape(Class shapeName) {
        if (window == null) {
            drawFrame();
        }

        Color color = null;
        askColor();

        switch (ch) {
            case 1:
                color = Color.RED;
                break;
            case 2:
                color = Color.GREEN;
                break;
            case 3:
                color = Color.BLUE;
                break;
        }

        // Draw the shape
        for (Shape s : list) {
            if (s.getClass().equals(shapeName)) {
                if (s.getClass().equals(Square.class)) {
                    window.getContentPane().removeAll();
                    window.getContentPane().add(new JSquare(s.getA(), s.getB(), color));
                }
                if (s.getClass().equals(Circle.class) || s.getClass().equals(Ellips.class)) {
                    window.getContentPane().removeAll();
                    window.getContentPane().add(new JOval(s.getA(), s.getB(), color));
                }
                if (s.getClass().equals(Triangle.class)) {
                    window.getContentPane().removeAll();
                    window.getContentPane().add(new JTriangle(s.getA(), s.getB(), color));
                }
            }
        }
    }

    private void askColor() {
        System.out.println("Введите 1 Красный\n"
                + "Введите 2 Зеленый\n" +
                "Введите 3 Голубой");

        this.ch = sc.nextInt();
    }

    private void drawFrame() {
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 300, 300);
        window.setVisible(true);
    }

    private void create() {
        System.out.println("Введите a и b");
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
                "Введите 3 Треугольник\n" +
                "Введите 4 Эллипс");

        this.ch = sc.nextInt();
    }
}

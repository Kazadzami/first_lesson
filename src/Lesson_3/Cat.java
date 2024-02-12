package Lesson_3;
import java.util.Scanner;

public class Cat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String circle = "круг";
        String square = "квадрат";
        String rectangle = "прямоугольник";
        System.out.println("Введите в консоль: \"прямоугольник\", \"квадрат\" или \"круг\" для вывода их площади и периметра");
        String s = sc.nextLine();

        if (circle.equals(s)) {
            System.out.println("Периметр круга: P = 2 * 3,14 * r,  r — радиус окружности.\nПлощадь круга: S = 3,14 * r**2");
        }
        else if (square.equals(s)){
            System.out.println("Периметр квадрата: P = 4 * a, где a — сторона квадрата.\nПлощадь квадрата: S = a**2");
        }
        else if (rectangle.equals(s)){
            System.out.println("Периметр прямоугольника: P = 2 * (a + b), где a и b — длина и ширина прямоугольника.\nПлощадь прямоугольника: S = a * b.");
        }
        else
            System.out.println("Введены неправильные даные");

    }
    //todo Напоминалка
}

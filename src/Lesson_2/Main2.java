package Lesson_2;

public class Main2 {

    public static void main(String[] args) {


        // Даны 3 стороны треугольника, вывести в консоль какой это треугольник: равносторонний, равнобедренный, разносторонний


        int sideA = 2;
        int sideB = 3;
        int sideC = 4;

        //Равносторонний a==b, b==c

        if ((sideA == sideB) && sideB == sideC)

            System.out.println("Это равносторонний треугольник ");

            else if ((sideA != sideB)
                && (sideB != sideC)
                && (sideC != sideA))
                System.out.println("Это разносторонний треугольник");

            else if ((sideA == sideB && sideC != sideA) || (sideA == sideC && sideB != sideA) || (sideC == sideB && sideB != sideA)) {
                    System.out.println("Это равнобедренный треугольник");

        }

        int a = 560;
        int b = 56;
        int c = 500;
        int d = 700;

        if (a > b){
            if (a > c){
                if (a > d){
                    System.out.println("Максимальное число - " + a);
                } else {
                    System.out.println("Максимальное число - " + d);
                }
            } else {
                if (c > d){
                    System.out.println("Максимальное число - " + c);
                } else {
                    System.out.println("Максимальное число - " + d);
                }
            }
        } else {
            if (b > c){
                if (b > d){
                    System.out.println("Максимальное число - " + b);
                } else {
                    System.out.println("Максимальное число - " + d);
                }
            } else {
                if (c > d){
                    System.out.println("Максимальное число - " + c);
                } else {
                    System.out.println("Максимальное число - " + d);
                }
            }
        }

    }
}
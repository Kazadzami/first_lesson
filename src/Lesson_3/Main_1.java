package Lesson_3;

public class Main_1 {
    public static void main(String[] args){

        Cat cat = new Cat();

        String hello = "Привет";
        int lenght = hello.length();
        System.out.println(lenght);

        char hw = hello.charAt(1);
        System.out.println(hw);




        int[] array = new int[5];
        String[] away = new String[4];

        int[] a = {1,2,3,4,5};

        a[1] = 10;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }

        int[] array10 = new int[10];
        for (int i = 0; i < array10.length ; i++) {
            array10[i] = 50 + i * 5;
        }
        for (int i = 0; i < array10.length; i++) {
            System.out.println(array10[i]);
        }

        int sum = 0;
        for (int i = 0; i < array10.length; i++) {
            sum = sum + array10[i];
        }
        System.out.println((double)sum/array10.length);
    }
}

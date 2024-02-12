package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class myFourthHomework {

    public static void main(String[] args) {

        /*  1) Сколько в массиве четных чисел?   */

        int arrov[] = {1, 2, 26, 3, 49, 5, 6, 8, 7, 8, 9, 10};

        for (int i = 0; i < arrov.length; i++) {
            if (arrov[i] % 2 == 0) {
                System.out.println(arrov[i]);
            }
        }

        System.out.println();

        /*  2) Все числа из массива, которые больше 10, но меньше 25.*/

        int sastochka[] = {100, 366, 677, 75, 15, 10, 11, 12, 13, 15, 16, 20, 25, 30, 40, 50, 60};
        for (int i = 0; i < sastochka.length; i++) {
            if ((sastochka[i] > 10) && (sastochka[i] < 25)) {
                System.out.println(sastochka[i]);
            }
        }

        /*Все числа в обратном порядке. При этом дважды вывести те числа, которые являются кратными трём*/

        System.out.println();

        int translation[] = {1, 9, 56, 18, 34, 99, 67, 2, 3};
        for (int i = translation.length - 1; i >= 0; i--) {
            if (translation[i] % 3 == 0) {
                System.out.println(translation[i]);
            }
            if (translation[i] % 3 == 0) {
                System.out.println(translation[i]);
            }
        }
    }
}
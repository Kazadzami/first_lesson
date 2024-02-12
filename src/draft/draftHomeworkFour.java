package draft;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class draftHomeworkFour {
    public static void main(String[] args) {
/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

    int k = 2;
    int b = 11;;
    int [][] a = new int[b][b];
        for (int i = 0; i < a.length; i++) {
            k += 2;
            for (int j = 0; j < a[i].length; j++) {
                if (((i + j) + k) <= a.length * 4){
                    a[i][i] = 1;
/*                    if (((i + j) + k) <= a.length * 4) */;
                    a[i][a.length - 1 - i] = 1;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            int [] d = a[i];
            for (int j = 0; j < d.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
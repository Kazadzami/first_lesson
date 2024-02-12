package HomeWork;

public class myFifthHomework {
    public static void main(String[] args) {

        /*1. Задать двухмерный массив целых чисел размером 9 х 9.
        Заполнить диагональ массива единицами, как на первой картинке.
        Код должен работать корректно, если поменять размер массива, например 11 х 11.*/

        int k = 2;
        int b = 9;;
        int [][] a = new int[b][b];
        for (int i = 0; i < a.length; i++) {
            k += 2;
            for (int j = 0; j < a[i].length; j++) {
                if (((i + j) + k) <= a.length * 4){
                    a[i][i] = 1;
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


        System.out.println();


/*      2. То же самое, но заполнить единицами обе диагонали, как на второй картинке.
        Код также должен работать корректно при любом размере массива.
        Решать с помощью циклов.*/

        int o = 2;
        int c = 11;;
        int [][] l = new int[c][c];
        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < l[i].length; j++) {
                while (k > l.length * 4)
                    k += 2;
                    l[i][l.length - 1 - i] = 1;
                    l[i][i] = 1;
            /*    if (((i + j) + o) <= l.length * 4){
                    l[i][i] = 1;
                    l[i][l.length - 1 - i] = 1;
                }*/
            }
        }

        for (int i = 0; i < l.length; i++) {
            int [] d = l[i];
            for (int j = 0; j < d.length; j++) {
                System.out.print(l[i][j] + " ");
            }
            System.out.println();
        }
    }
}
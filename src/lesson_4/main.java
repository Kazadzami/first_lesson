package lesson_4;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        for (int i = a.length - 1; i >= 0; i -= 2) {
            System.out.println(a[i]);
        }
        
/*        char[] symbols = {'в','а', 'у','к','ы','п'};
        for (int i = 0; i < ; i++) {*/


        int[] g = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i <g.length ; i++) {
            if (i == 0){
                System.out.println(g[i] + g[i + 1]);
            } else if (i == g.length - 1) {
                System.out.println(g[i] + g[i - 1]);
            }
            else
                System.out.println(g[i] + g[i - 1] + g[i + 1]);
        }


        char[] qwer = "qwer".toCharArray();
        char[] abcd = "abcd".toCharArray();
        char[] result = new char[qwer.length + abcd.length];

        for (int i = 0; i < qwer.length; i++) {
            result[i] = qwer[i];
        }
        for (int i = 0 + 1; i < abcd.length; i++) {
            result[i + qwer.length] = abcd[i];
        }
        System.out.println(result);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] symbols = input.toCharArray();

        for (int i = 0; i < symbols.length; i ++){
            if ((symbols[i] == '1') || (symbols[i] == '2'));{
                System.out.println("Пароль содержит символ");
                return;
            }

        }
        System.out.println("Пароль не содержит цифру");




    }
}

package Lesson_3;

public class Main {
    public static void main(String[] args){

/*
        int a = -1;
        int b = a > 0 ? 1 : 2; // Если условие true = 1, если false = 2. Можно прописать только две переменые (Протернарный оператор) Можно присвоить к переменой функцию
        System.out.println(b);

        int j = 0;
        for (; j < 5; j++){ // Условия в for можно писать либо в самом цикле либо за его пределами  перед циклом но нужно ставить ";" чтобы компелятор мог понять что в цикле три условия
            System.out.println();
        }
        for (int i = 0; i < 5; i++){  // первая переменая это начальная точка от которой происходит запуск цикла, вторая переменая это булево значение, пока условие не станет отрицательным цикл будет работать, третье условие это добавление к первому
            System.out.println("Привет");
        }
*/

        for (int i = 10; i <= 20 ; i++) { // Вывод четных чисел, если подставить 1 - не четное
            if (i % 2 == 0){
                System.out.println(i);
            }
        }


        double money = 1_000_000;

        int trade = 7;
        int year = 5;
        for (int i = 0; i < year * 12; i++) {
            money = money +  money * ((double) trade / 100);}

        System.out.printf("%.2f\n", money);



        int a = 1;
        int b = 30; // Сумма числе от 1 до 10

        int sum = 0;
        for (int i = a; i <= b ; i++) {
            if(i % 2 == 0 && i % 3 == 0){
            sum += i;
            }
        }
        System.out.println(sum);



    }
}

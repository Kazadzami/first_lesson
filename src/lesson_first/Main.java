package lesson_first;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world");
        int a;
        /*  задача
         * длмна комнаты -12 метров , ирина комнаты - 7 метров
         * длина стола 3 метра, ширина стола - 2 метра
         * сколько  войдет в комнату
         */

        int roomLength = 12;
        int roomWeidth = 7;
        int tableLength = 3;
        int tableWeidth = 2;

        int tableAtLength = roomLength / tableLength;
        int tablesAtWeidth = roomWeidth / tableWeidth;

        int tableCount = tableAtLength * tablesAtWeidth;


        boolean b = false;
        System.out.println(tableCount);


    }
}


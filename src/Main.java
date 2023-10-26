
public class Main {
    public static void main(String[] args) {
        //переменная для хранения валюты :  рубли
        int walletRU = 2000;

        // переменная для хранения валюты: доллар
        int walletDollar = 94;
        boolean lie = false;
        boolean truth = true;
        //информация  о валюте для вывода в консоль
        String str = " рублей в долларах это - ";
        // Переменная хранящая результат преобразования
        int result = walletRU / walletDollar;

        // Выводим в консоль полученный результат
        System.out.println(walletRU + str + result);

        /*
         *Арифметические операции:
         * сложение+
         * вычитание-
         * умножение*
         * деление/
         * остаток от деления %
         **/
        sum(10, 25);

        deduction(40, 20);

        multiplication(10, 2);

        division(60, 2);

    }


    public static void sum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("результат сложения двух чисел равен -" + result);

    }

    public static void deduction(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("результат вычитания равен -" + result);

    }

    public static void multiplication(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("результат умножения равен -" + result);

    }

    public static void division(int num1, int num2) {
        int result1 = num1 / num2;
        int result2 = num1 % num2;
        System.out.println("результат деления равен -" + result1);
        System.out.println("результат деления равен -" + result2);


    }
}
public class Pz5 {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sum(int a, int b, int c) {
        return a+b+c;
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void printMrssage(String message) {
        System.out.println(message);
    }
    public static void main(String[] args) {
        int result1 = sum(10, 34);
        printMrssage("Сумма 10 и 34 = " + result1);

        int result2 = sum(56, 43, 9);
        printMrssage("Сумма трёх чисел(56, 43, 9) = " + result2);

        int num_a = 77;
        if (isEven(num_a)) {
            printMrssage(num_a + " Является четным числом");
        } else {
            printMrssage(num_a + " Не является чётным числом");
        }


    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pz9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean validInput = false;

        try {
            System.out.print("Введите первое целое число: ");
            num1 = scanner.nextInt();
            System.out.print("Введите второе целое число: ");
            num2 = scanner.nextInt();

            int result = num1 / num2 ;
            System.out.println("Приблизительный результат деления числа " + num1 + " на " + num2 + " = " + result);
            validInput = true;

        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не целое число :(");
            scanner.nextLine();

        }catch (ArithmeticException e){
            System.out.println("Извините, но мы не производим деление на 0, обратитесь к специалисту");
        }finally {
            System.out.println("Мы закрываемя на неопределённый период, спасибо что были с нами bb");
            scanner.close();
        }
    }
}

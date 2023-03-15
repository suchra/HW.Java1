// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120
import java.util.Scanner;


public class task1 {
    static int summa(int num){
        int sum = 0;
        while (num>0){
            sum = sum +num;
            num--;
        }
        return sum;
    }

    static int factorial(int num){
        if (num == 1) return 1;
        else {
        return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {
        Scanner iScanner= new Scanner(System.in);
        System.out.print("Введите целое число N: ");
        int num = iScanner.nextInt();
        // System.out.println(num);
        iScanner.close();

        // 
    System.out.println("Сумма чисел от 1 до N равна: " + summa(num));

    System.out.print("Факториал числа N равeн: " + factorial(num));

}
}
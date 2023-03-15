// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner iScanner= new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = iScanner.nextInt();
        System.out.print("Введите знак арифметического действия: ");
        char znak = iScanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        double num2 = iScanner.nextInt();
        System.out.print("Результа вычисления равен: ");
        if (znak == '+'){
            System.out.print((num1 + num2));
        }
        else if (znak == '-'){
            System.out.print((num1 - num2));
        }
        else if (znak == '*'){
            System.out.print((num1 * num2));
        }
        else if (znak == '/'){
            System.out.print((num1 / num2));
        }
        iScanner.close();
    }
}

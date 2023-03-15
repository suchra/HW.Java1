// Вывести все простые числа от 1 до 1000

public class task2 {
    public static void main(String[] args) {
        System.out.println("Простые числа в интервале от 1 до 1000:");
        for (int i = 2; i < 1000; i++){
            int num = 0;
            for (int j = 2; j < i; j++){
                if ((i % j) != 0){
                    num += 0;
                } else {
                    num +=1;
                }
            }
            if (num == 0){
                System.out.print(i + ", ");
            }

        }
    }
}
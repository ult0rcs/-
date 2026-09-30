package semester1.practice04.homework;

import java.util.Scanner;

public class Task3FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ЧИСЛА ФИБОНАЧЧИ И ЗОЛОТОЕ СЕЧЕНИЕ ===");
        System.out.print("Сколько чисел сгенерировать (N >= 3): ");
        int n = scanner.nextInt();

        if (n < 3 || n > 30) {
            System.out.println("Введите число от 3 до 30.");
            scanner.close();
            return;
        }

        int f1 = 1;
        int f2 = 1;
        double ratio = 0.0;

        System.out.println();
        System.out.println("№ 1  | Число: 1");
        System.out.println("№ 2  | Число: 1");

        for (int i = 3; i <= n; i++) {
            int next = f1 + f2;
            ratio = (double) next / f2;

            System.out.printf(
                    "№ %-2d | Число: %-10d | Отношение F(n)/F(n-1) = %.6f%n",
                    i, next, ratio
            );

            f1 = f2;
            f2 = next;
        }

        System.out.printf("%nИтог: найдено приближение Золотого сечения: %.6f%n", ratio);
        System.out.printf("Эталонное значение:                             %.6f%n", 1.6180339);
        System.out.println("=========================================");

        scanner.close();
    }
}
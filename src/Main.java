import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();
        System.out.print("Введите число c: ");
        int c = scanner.nextInt();

        // Проверяем, делится ли каждое число на 5
        boolean divisibleBy5 = false;
        if (a % 5 == 0) {
            System.out.println("a=" + a);
            divisibleBy5 = true;
        }
        if (b % 5 == 0) {
            System.out.println("b=" + b);
            divisibleBy5 = true;
        }
        if (c % 5 == 0) {
            System.out.println("c=" + c);
            divisibleBy5 = true;
        }
        if (!divisibleBy5) {
            System.out.println("Нет значений, кратных 5");
        }

        // Выводим результаты операций
        System.out.println("Целочисленное деление a на b: " + (a / b));
        System.out.println("Деление a на b: " + ((double) a / b));
        System.out.println("Деление a на b, округленное в большую сторону: " + Math.ceil((double) a / b));
        System.out.println("Деление a на b, округленное в меньшую сторону: " + Math.floor((double) a / b));
        System.out.println("Деление a на b, округленное до ближайшего целого математическим округлением: " + Math.round((double) a / b));
        System.out.println("Остаток от деления b на c: " + (b % c));
        System.out.println("Наименьшее значение из a и b: " + Math.min(a, b));
        System.out.println("Наибольшее значение из b и c: " + Math.max(b, c));
    }
}
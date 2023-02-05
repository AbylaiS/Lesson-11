import java.util.Scanner;

public class Main {

    //        static void checkAge(int age) {
//            if (age < 21) {
//                throw new ArithmeticException("Доступ запрещен");
//            } else {
//                System.out.println("Доступ разрешен");
//            }
//        }
    public static double divide(double x, double y) throws Exception {
        if (y == 0) {
            throw new Exception("Нельзя делить на ноль.");
        }
        return x / y;
    }


    public static void main(String[] args) {

//        try {
//            int[] integers = {1 ,4 ,6};
//            System.out.println(integers[10]);
//
//        } catch (Exception e){
//
//            System.out.println("Ошибка! Индекс вне диопазона значений");
//        }finally {
//            System.out.println("Try catch завершен");
//        }
//        checkAge(22);
//        №1
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите число: ");
//
//        try {
//            double num = sc.nextDouble();
//            double sqrt = Math.sqrt(num);
//            System.out.println("Квадратный корень из " + num + " это " + sqrt);
//        } catch (Exception e) {
//            System.out.println("Неверный Ввод.");
//        }

//       №2
        try {
            double result = divide(10, 5);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }


//        №3
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку целых чисел,: ");
//        String input = scanner.nextLine();
//        scanner.close();
//        String[] tokens = input.split(" ");
//        int sum = 0;
//        for (String token : tokens) {
//            try {
//                int num = Integer.parseInt(token);
//                sum += num;
//            } catch (NumberFormatException e) {
//                System.out.println("'" + token + "' не является целым числом.");
//            }
//        }
//        System.out.println("Сумма целых чисел в строке равна " + sum + ".");
    }
}
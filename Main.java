import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите выражение \"x + y\", \"x - y\", \"x * y\", \"x / y\": ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        calc(input);

    }
    public static String calc(String input) {
        int num1;
        int num2;
        String[] c = input.split(" ");
        try {
            num1 = Integer.parseInt(c[0]);
            num2 = Integer.parseInt(c[2]);

            if (num1 < 0 || num1 > 11 || num2 < 0 || num2 > 11) {
                System.out.println("Числа не в диапазоне");
            }
            else {
                switch (c[1]) {
                    case "+":
                        System.out.println(num1 + num2);
                        break;
                    case "-":
                        System.out.println(num1 - num2);
                        break;
                    case "*":
                        System.out.println(num1 * num2);
                        break;
                    case "/":
                        if (num2 != 0)
                            System.out.println(num1 / num2);
                        else
                            System.out.println("На 0 делить нельзя");
                        break;
                    default:
                        System.out.println("Нет такой операции");

                }

            }
        }
        catch (Exception E) {
            System.out.println("Неправильно введены числа");
        }
        return null;
    }
}
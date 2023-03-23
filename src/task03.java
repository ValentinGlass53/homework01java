import java.util.Scanner;
class task03 {
    public static void main(String[] args) {
        /*
        Реализовать простой калькулятор (+ - / *)
        Ввод числа ->
        Ввод знака ->
        Ввод числа ->
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите знак");
        String sign = scanner.next();
        System.out.println("Введите второе число");
        int num2 = scanner.nextInt();
        int result;

        if(sign.equals("+")){
            result = num1 + num2;
            System.out.println(result);
        } else if (sign.equals("-")) {
            result = num1 - num2;
            System.out.println(result);
        }
        else if (sign.equals("*")) {
            result = num1 * num2;
            System.out.println(result);
        }
        else if (sign.equals("/")) {
            result = num1 / num2;
            System.out.println(result);
        }
        else{
            System.out.println("Вы ввели не правильный знак");
        }


    }
}

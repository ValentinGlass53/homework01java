import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        /*
        Вычислить n-ое треугольного число(сумма чисел от 1 до n),
        а так же n! (произведение чисел от 1 до n)
        Ввод:5
        Треугольное число 1 + 2 + 3 + 4 + 5 = 15
        n! 1 * 2 * 3 * 4 * 5 = 120
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        //System.out.println(num);
        int i = 1;
        int j = 1;
        int sum = 0;
        int comp = 1;
        while(i <= num)
        {
            sum = sum + i;
            i++;
        }
        System.out.println("треугольного число = "+ sum);
        while(j <= num)
        {
            comp = comp * j;
            j++;
        }
        System.out.println("n! = " + comp);

    }
}

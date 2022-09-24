import java.util.Scanner;

public class Summation {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int number = sc.nextInt();
        System.out.println(summation(number));


    }

    static int summation(int number) {
        int sum = 0;
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
        } else {
            System.out.println("Insira um número inteiro de valor maior que zero.");
        }
        return sum;
    }
}

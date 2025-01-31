import java.util.Scanner;
public class lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();
        double a = input.nextDouble();
        double b = input.nextDouble();

        double y = Math.log(a + x * x) / Math.exp(Math.sin(x)) + 2 * b;
        System.out.println(y);
    }
}
// 13
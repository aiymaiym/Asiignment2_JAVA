import java.util.Scanner;
public class lab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();
        int iterations = input.nextInt();

        double S = 0;
        for (int n = 0; n < iterations; n++) {
            S += Math.pow(x, 2 * n + 1) / (4 * n + 1);
        }
        System.out.println(S);
    }
}
//3
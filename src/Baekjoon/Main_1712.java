
import java.util.Scanner;

public class Main_1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b=sc.nextInt(), c = sc.nextInt();

        int result = 0;

        if(c <= b) result = -1;
        else result = a / (c -b) +1;
        System.out.println(result);
    }
}

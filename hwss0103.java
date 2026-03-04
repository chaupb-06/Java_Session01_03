import java.util.*;

public class hwss0103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int tu = a*d +  b*c;
        int mau = b*d;
        System.out.println(tu + "/" + mau);
    }
}

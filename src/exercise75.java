/**
 * Created by Praktika on 7.12.2016.
 */
public class exercise75 {
    public static void main(String[] args) {
        double i = 0.1;
        while(i<=100.0) {
            check(i);
            i = i * 10.0; } }
    public static void check(double x) {
        int n = 18;
        System.out.println(x + "\t" + Math.exp(x) + "\t" + myexp(x, n) + "\t" + digimatch(Math.exp(x),myexp(x, n))); }
    public static int digimatch(double x1, double x2) {
        int count = 0;
        int i = 0;
        int n = 16;
        String str1 = String.valueOf(x1);
        String str2 = String.valueOf(x2);
        while(i <= n ) {
            if (str1.charAt(i) == str2.charAt(i))
            { count += 1; }
            else { return count; }
            i = i + 1; }
        return count; }
    public static double myexp(double x, int n) {
        double ansX = x;
        double ans = 0;
        double denom = 1;
        int i = 2;
        while (i<=n) {
            ansX = ansX*x;
            denom = denom * i;
            ans = ans + ansX/denom;
            i = i + 1; }
        return (1 + x + ans);
    }
}


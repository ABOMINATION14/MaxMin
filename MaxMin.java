public class maxmin {
    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;Initialize git
    }
    public static int findMin(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }
    public static void main(String[] args) {
        int a = 10, b = 25, c = 7;
        System.out.println("Numbers: " + a + ", " + b + ", " + c);
        System.out.println("Maximum is: " + findMax(a,b,c));
        System.out.println("Minimum is: " + findMin(a,b,c));
    }
}
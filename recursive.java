
public class recursive {

    public static void main(String[] args) {
        int n = 1;
        printSum(1, 5, 0);
    }

    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        printSum(i + 1, n, sum);
    }

}
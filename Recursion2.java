public class Recursion2 {
    public static void towerOdHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk number " + n + " from " + src + " to " + dest);
            return;
        }

        towerOdHanoi(n - 1, src, dest, helper);
        System.out.println("Transfer disk number " + n + " from " + src + " to " + dest);
        towerOdHanoi(n - 1, helper, src, dest);

    }

    public static void main(String[] args) {
        int n = 4;
        towerOdHanoi(n, "S", "H", "D");
    }

}

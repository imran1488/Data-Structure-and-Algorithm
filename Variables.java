class Variables {
    public static void main(String[] args) {
        String name = "Aman";
        double price = 44.5;
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println("The sum of two variables are " + sum);

        int ans = a * b / a - b;
        int ans1 = (a * b) / (a - b);
        System.out.println(ans);
        System.out.println(ans1);
    }
}
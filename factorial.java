class factorial {
    public static void fact(int n) {
        int prod = 1;
        if (n <= 0) {
            System.out.println(1);
        }
        for (int i = n; i >= 1; i--) {
            prod = prod * i;

        }
        System.out.println(prod);
    }

    public static void main(String[] args) {
        fact(-1);
    }
}
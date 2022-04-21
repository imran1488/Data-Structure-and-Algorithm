public class revereseastring {
    public static void main(String[] args) {
        String s = "abcd";
        int idx = s.length() - 1;
        printRev(s, idx);
    }

    public static void printRev(String str, int idx) {

        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx - 1);
    }

}

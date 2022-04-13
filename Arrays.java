import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Enter the length of Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int marks[] = new int[size];
        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(marks[i]);
        }
    }
}

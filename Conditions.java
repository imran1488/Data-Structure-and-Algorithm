import java.net.SocketTimeoutException;
import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b){
            System.out.println("Equals");
        }
        else{
            if(a>b){
                System.out.println("A is greater than b");
            }
            else{
                System.out.println("A is lesser than B");
            }
        }
        
    }

}

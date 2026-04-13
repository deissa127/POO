import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == 0){
            System.out.println("C");
        } else if (a == 1 && b == 0){
            System.out.println("B");
        } else {
            System.out.println("A");
        }
        scanner.close();
    }
}
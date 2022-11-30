import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        String X = "ACBDAB";
        String Y = "BDCABA";
        LCS.search(X,Y);
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        while (!input.hasNext()) input.nextLine();
        String X = input.next();
        System.out.print("Enter the second string: ");
        while (!input.hasNext()) input.nextLine();
        String Y = input.next();
        LCS.search(X,Y);
    }
}

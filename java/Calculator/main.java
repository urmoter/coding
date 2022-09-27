import java.util.Scanner;

public class main{
    public static void abc(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name?: ");
        String name = scan.nextLine();
        System.out.print("hello " + name + "!");
        scan.close();
        return;
    }
}
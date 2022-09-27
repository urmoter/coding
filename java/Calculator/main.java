import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name?: ");
        String name = scan.nextLine();
        System.out.print("hello " + name + "!");
        return;
    }
}
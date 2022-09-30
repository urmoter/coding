//importing
import java.util.*;
import java.lang.Math;
//main class
public class main{
    //custom error
    //method main
    public static void main(String[] args) {
        //declaring
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ops = new ArrayList<String>(Arrays.asList("+" , "-" , "*" , "^" , "/" , "%", "2D", "3D"));
        boolean add, sub, mul, exp, div, rem;
        add = sub = mul = exp = div = rem = false;
        //actual code
        System.out.println("What operation(+,-,*,^,/,%,2D,3D)?: ");
        String input = sc.nextLine();
        if (ops.contains(input) == false) {
            System.out.println("Invalid input!");
            return;
        }
        if (input == ops.get(0)) {
            System.out.println("Addition");
            add = true;
        }
        if (input == ops.get(1)) {
            System.out.println("Subtraction");
            sub = true;
        }
        if (input == ops.get(2)) {
            System.out.println("Multiplication");
            mul = true;
        }
        if (input == ops.get(3)) {
            System.out.println("Exponentiation");
            exp = true;
        }
        if (input == ops.get(4)) {
            System.out.println("Division");
            div = true;
        }
        if (input == ops.get(5)) {
            System.out.println("Remainder");
            rem = true;
        }
        if (input == ops.get(6)) {
            ArrayList<String> shapes = new ArrayList<String>(Arrays.asList("rect", "squ", "circ", "tri"));
            System.out.println("What shape(rect,squ,circ,tri)");
            String shape = sc.nextLine();
            if (shapes.contains(shape) == false) {
                System.out.println("Invalid input!");
                return;
            }
            if (shape == shapes.get(0)) {
                System.out.println("rect");
                System.out.println("Length");
                Integer L = sc.nextInt();
                System.out.println("Width");
                Integer W = sc.nextInt();
                Integer A = L*W;
                System.out.println(A);
                return;
            }
            if (shape == shapes.get(1)) {
                System.out.println("squ");
                System.out.println("Side");
                Integer S = sc.nextInt();
                Integer A = S*S;
                System.out.println(A);
                return;
            }
            if (shape == shapes.get(2)) {
                System.out.println("circ");
                Double pi = 3.14;
                System.out.println("Radius");
                Integer R = sc.nextInt();
                Double A = pi * (R*R);
                System.out.println(A);
                return;
            }
            if (shape == shapes.get(3)) {
                System.out.println("tri");
                System.out.println("Height");
                Integer H = sc.nextInt();
                System.out.println("Base");
                Integer B = sc.nextInt();
                Integer A = (H*B)/2;
                System.out.println(A);
                return;
            }
        }
        if (input == ops.get(7)) {
            ArrayList shapes_3D = new ArrayList<String>(Arrays.asList("rect", "cube", "sph", "pyr"));
            System.out.println("What shape(rect,cube,sph,pyr)");
            String shape_3D = sc.nextLine();
            if (shapes_3D.contains(shape_3D)) {
                System.out.println("Invalid input!");
                return;
            }
            if (shape_3D == shapes_3D.get(0)) {
                System.out.println("rectangular Prism");
                System.out.println("Length");
                Integer L = sc.nextInt();
                System.out.println("Width");
                Integer W = sc.nextInt();
                System.out.println("Height");
                Integer H = sc.nextInt();
                Integer A = L*W*H;
                System.out.println(A);
                return;
            }
            if (shape_3D == shapes_3D.get(1)) {
                System.out.println("cube");
                System.out.println("Edge");
                Integer S = sc.nextInt();
                Integer A = S*S*S;
                System.out.println(A);
                return;
            }
            if (shape_3D == shapes_3D.get(2)) {
                System.out.println("sphere");
                Double pi = 3.14;
                System.out.println("Radius");
                Integer R = sc.nextInt();
                Double A = (4/3)*(pi*(R*R*R));
                System.out.println(A);
                return;
            }
            if (shape_3D == shapes_3D.get(3)) {
                System.out.println("pyr");
                System.out.println("Height");
                Integer H = sc.nextInt();
                System.out.println("Length");
                Integer L = sc.nextInt();
                System.out.println("Width");
                Integer W = sc.nextInt();
                Integer B = L*W;
                Integer A = (1/3)*(B*H);
                System.out.println(A);
                return;
            }
        }
        System.out.println("First number");
        Integer n1 = sc.nextInt();
        System.out.println("Second number");
        Integer n2 = sc.nextInt();
        if (add == true) {
            System.out.println(n1+n2);
       }
        if (sub == true) {
            System.out.println(n1-n2);
        }
        if (mul == true) {
            System.out.println(n1*n2);
        }
        if (exp == true) {
            System.out.println(Math.pow(n1, n2));
        }
        if (div == true) {
            System.out.println(n1/n2);
        }
        if (rem == true) {
            System.out.println(n1%n2);
        }
        return;
    }
}
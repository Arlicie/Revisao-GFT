package Exercicios_Basicos;
import java.util.Scanner;

public class Equacao_2_Grau {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digitar os valores de a, b, c respectivamente: ");
        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat();
        if (a == 0 || b == 0){
            System.out.println("Os valores de a e b não podem ser 0");
            System.out.println("Digitar os valores de a e b respectivamente: ");
            a = scan.nextFloat();
            b = scan.nextFloat();
        }

        delta =(b*b)-4*a*c;
        x1 = (b+Math.sqrt(delta))/2*a;
        x2 = (b-Math.sqrt(delta))/2*a;

        System.out.println("As raízes da equação são:  " + x1 + " " + x2);
    }
}

package Exercicios_Basicos;
import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String produto;
        double valor, valorProduto, valorFinal=0;
        int quantidade, i=0;

        do {
            System.out.println("Informar o produto, valor e quantidade");
            produto = scan.next();
            valor = scan.nextDouble();
            quantidade = scan.nextInt();
            if (quantidade>10 && quantidade<21){
                valorProduto=(quantidade*valor)*0.9;
                System.out.println("Valor total do produto a se pago: " +valorProduto);
                valorFinal+=valorProduto;
            } else if (quantidade>20 && quantidade<51) {
                valorProduto=(quantidade*valor)*0.8;
                System.out.println("Valor total do produto a se pago: " +valorProduto);
                valorFinal+=valorProduto;
            } else if (quantidade>50) {
                valorProduto=(quantidade*valor)*0.75;
                System.out.println("Valor total do produto a se pago: " +valorProduto);
                valorFinal+=valorProduto;
            }else{
                valorProduto=quantidade*valor;
                valorFinal+=valorProduto;
                System.out.println("Valor total do produto a se pago: " +valorProduto);
            }
            System.out.println("Deseja informar outro produto? 1-sim e 0-não");
            i = scan.nextInt();
        }while (i==1);
        System.out.println("Valor total a ser pago: " +valorFinal);
    }
}

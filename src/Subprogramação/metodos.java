package Subprogramação;
import java.util.Scanner;


public class metodos {
    public static void media(){
        int notasQuantidade;
        double nota;
        double media=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas: ");
        notasQuantidade = scan.nextInt();

        for(int i=1; i<=notasQuantidade; i++){
            System.out.println("Digite a nota "+i+": ");
            nota = scan.nextDouble();
            media= media + nota;
        }
        media=media/notasQuantidade;
        System.out.println("Media: "+media);

        metodos.respostaAprovação(media);
    }

    public static void respostaAprovação(double media){
        if (media>6){
            System.out.println("Situação: Aprovado");
        } else if (media<7 && media >3) {
            System.out.println("Situação: Verificação Suplementar");
        }else System.out.println("Situação: Reprovado");
    }
}

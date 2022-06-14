package Variaveis_Compostas;
import java.util.Random;

public class Numeros_Aleatorios {
    public static void main(String[] args) {
        int vetor[], maior, menor;
        vetor = new int[100];
        Random random = new Random();
        for (int i=0; i<100; i++){
            vetor[i]= random.nextInt(100);
            System.out.println(vetor[i]);
        }
    }
}

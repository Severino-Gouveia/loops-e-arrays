package exercicios.loops.exercicio02;

import java.util.Scanner;

public class NotaEntre_0_10 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int nota;
            System.out.println("Digite uma nota entre 0 e 10 :");
            nota =scan.nextInt();
            while(nota< 0| nota>10){
                System.out.println("Nota invalida escolha otra nota! ");
                nota =scan.nextInt();
            }
            
        }
        System.out.println("Você digitou uma nota válida fim do programa! ");
    }
}

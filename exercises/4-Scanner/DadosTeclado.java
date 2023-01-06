/*
SCANNER 
Para usar a classe “Scanner” precisamos importar a biblioteca “java.util.Scanner”.

Para a leitura do texto/String usamos o método “nextLine” 
nome=scan.nextLine(); 

Para a leitura do inteiro usamos o método “nextInt”.
n1=scan.nextInt();
*/

import java.util.Scanner;

public class DadosTeclado{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n1=0, n2=0, n3=0, n4=0, soma=0;
        final int MEDIA = 60;
        String nome="", res="";

        System.out.println("Digite o nome do aluno: ");
        nome=scan.nextLine();
        System.out.println("Digite a primeira nota: ");
        n1=scan.nextInt();
        System.out.println("Digite a segunda nota: ");
        n2=scan.nextInt();
        System.out.println("Digite a terceira nota: ");
        n3=scan.nextInt();
        System.out.println("Digite a quarta nota: ");
        n4=scan.nextInt();

        soma=n1+n2+n3+n4;

        if(soma >= MEDIA){
            res = "Aprovado";
        }else if(soma >= 40){
            res = "Recuperacao";
        }else{
            res = "Reprovado";
        }
        System.out.printf("Aluno %s foi %s, com nota %d", nome,res,soma);
    }
}
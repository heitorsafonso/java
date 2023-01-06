import java.util.Scanner;

public class Loop{
    public static void main(String[] args) {
        loopfor();
        loopwhile();
        loopdowhile(); 
    }

    /*
    FOR (inicialização; controle; incremento) 
    O loop FOR tem uma sintaxe diferenciada do loop while, usamos o loop for quando podemos prever quantas iterações serão executadas.
    cont++ / cont = cont+1 / cont+=1 
    
    for (int i = 0; i < array.length; i++) {
      
    }
    */
    public static void loopfor(){
        for(int cont=0; cont < 5; cont++){
            System.out.println(cont + " - CFB Cursos");
        }
        System.out.println("Fim do programa");
        
        for(int cont=5; cont > 0; cont--){
            System.out.println(cont + " - CFB Cursos");
        }
        System.out.println("Fim do programa"); 
    }
    
    /*
    WHILE
    O comando while ("enquanto") é um comando de loop, isso significa que ele executa um bloco de comandos enquanto uma determinada condição for satisfeita. Precisamos preparar a condição antes da entrada do while e dentro do bloco de comandos devemos trabalhar na condição de parada do loop, pois correse o risto do comando entrar em um loop infinito e levar a parada do programa.
    
    while (condition) {
        
    }
    */
    public static void loopwhile(){
        Scanner scan = new Scanner(System.in);
        
        int max=scan.nextInt();
        int cont=0;
        while(cont < max){
            System.out.println(cont + " - CFB Cursos");
            cont++;
        }
        System.out.println("Fim do programa");
    }
    
    /*
    DO WHILE
    É semelhante ao comando while, mas enquanto o comando while testa a condição no início o comando do while testa a condição no final.
    
    do {
        
    } while (condition);
    */
    public static void loopdowhile(){
        Scanner scan = new Scanner(System.in);
        
        int max=scan.nextInt();
        int cont=0;
        
        do{
            System.out.println(cont + " - CFB Cursos");
            cont++;
        }while(cont < max);
        System.out.println("Fim do programa");
    }
}
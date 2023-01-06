public class ComandosDecisao{
    public static void main(String[] args) {
        comandoIfelse();
        comandoSwitch();
        comandoTernario(); 
    }
    
    /*
    IF / ELSE
    Comandos para controle de execução de ações em um programa, realizar um teste lógico e se o resultado deste teste for verdadeiro o comando IF executa um determinado bloco de comandos ou não.
    Um complemento ao comando IF é o ELSE, que é o caso contrário do IF, ou seja, se o resultado da comparação for
    falso.
    OBS: Um detalhe importante sobre o bloco de comandos do IF é que, se existir somente um comando para ser
    executado pelo IF, não é necessário utilizar chaves { }, assim os códigos a seguir resultam no mesmo fim. Somente é obrigatório o uso das { } quando o bloco IF contiver mais de uma linha de comando.


    if (condition) {

    } else {
        
    }
    */

    public static void comandoIfelse(){
        int nota=20;
        int faltas=4;
        int maxFaltas=5;
        int media=60;

        if((nota >= media) && (faltas <= maxFaltas)){
            System.out.println("Aprovado por nota e frequencia");
        }else if((nota >= 40) && (faltas <= maxFaltas)){
            System.out.println("Recuperacao");
        }else if((nota <= 40) && (faltas >= maxFaltas)){
            System.out.println("Reprovado por nota e frequencia");
        }else if(faltas >= maxFaltas){
            System.out.println("Reprovado por frequencia");
        }else{
            System.out.println("Reprovado por nota");
        }
        System.out.println("Fim do programa"); 
    }

    /*
    SWITCH
    O comando switch é “semelhante” ao comando “IF”, onde dependendo do resultado de um determinado teste será executado um determinado bloco de comandos.

    switch (key) {
        case value:
        
        break;
        
        default:
        break;
    }
    */
    public static void comandoSwitch(){
        int pos=2;
        switch (pos) {
            case 1: System.out.println("Primeiro Lugar");
            break;

            case 2: System.out.println("Segundo Lugar");
            break;
            
            case 3: System.out.println("Terceiro Lugar");
            break;
            
            case 4: case 5: case 6: System.out.println("Premio de participacao");
            break;
            
            default: System.out.println("Nao ganhou premio");
            break;
        }
    }

    /*
    TERNARIO
    O operador condicional ternário pode substituir o IF ELSE em alguns casos mais simples.

    (expressão) ? se_verdadeiro : se_falso;

    */
    public static void comandoTernario(){
        int nota=40;
        int media=60;
        int res;
        
        res=(nota >= media ? 1:0);
            
        System.out.println("Resultado: " + (res==1?"Aprovado":"Reprovado"));
    }
}
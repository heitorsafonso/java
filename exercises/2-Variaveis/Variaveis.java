/*
VARIAVEIS PRIMITIVAS
boolean:    Tipo lógico, verdadeito/true/1 ou falso/false/0
char:       Tipo caractere, dados alfanuméricos.
String:     Tipo texto.
byte:       Inteiro de 8 bits. Valores entre -27=-128 e 27-1=127.
short:      Inteiro de 16 bits. Valores entre -2-15=-32.768 e 215-1=32.767
int:        Inteiro de 32 bits. Valores entre -231=2.147.483.648 e 231-1=2.147.483.647.
long:       Inteiro de 64 bits. Valores entre -263 e 263-1.
float:      Números reais (ponto flutuante) de 32 bits. Valores entre 1.40239846e-46 e 3.40282347e+38
double:     Números reais (ponto flutuante) de 64 bits. Valores entre 4.94065645841246544e-324 e 1.7976931348623157e+308

VARIAVEIS GLOBAIS: Podem ser acessadas por qualquer método da classe.
VARIAVEIS LOCAIS: São criadas dentro dos métodos, seu escopo é somente o método onde foi declarada

STATIC
Classes estáticas só podem acessar variáveis que também sejam estáticas.
Quando declaramos variáveis static em uma classe ela será exatamente a mesma para todos os objetos desta classe, ou seja, não teremos um tipo diferente em cada objeto, todos os objetos, ao acessarem e modificarem essa variável, acessarão a mesma variável, o mesmo espaço na memória, e a mudança valerá para todos os objetos.
Um fator importante a ser destacado é que não podemos declarar duas variáveis com mesmo nome no mesmo escopo.
*/
public class Variaveis{
    public static void main(String[] args) {
        int n1=10, n2=20, n3=30;
        int res=n1 + n2 + n3;

        int num=100;
        String nome="Bruno";

        System.out.print("CFB Cursos\n");   //  Imprime e \n pula 
        System.out.println("Curso de Java");    //  Imprime e pula linha
        System.out.printf("Canal: %s%nAno: %d%n","CFB Cursos", 2021);   
        //  Imprime com formatacao (%s = String, %n = pula linha, %d = inteiro)
        System.out.printf("Valor da variavel num: %d%nNome: %s%n", num, nome);
        System.out.printf("Resultado:%d", res);
    }
}
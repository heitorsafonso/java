/*
METODO
Um método em Java é equivalente a uma função, subrotina ou procedimento em outras linguagens de programação. Não existe em Java o conceito de métodos globais. Todos os métodos devem sempre ser definidos dentro de uma classe.

- Metodos podem receber parametros de entrada (String, int, double...), esses atributos devem ser informados na chamada do metodo. É possivel definir quantidades indefinidas de parametro (ex: int... numeros)
- Os metodos podem retornar algum valor ou não (VOID é um metodo sem retorno)
- É possivel colocar o mesmo nome, mas com entradas diferentes para evitar sobrecarga de metodos.

*/
public class Metodo{
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            canal();
        }

        msg("CFB Cursos Java", 5);
        System.out.println(soma1(10,5,4));
        System.out.println(soma2(10,5,4,5,4,3));
        System.out.println(soma2(10,5,4,3.5));
    }

    //Metodo canal
    public static void canal(){
        System.out.println("CFB Cursos");
    }

    //Metodo msg
    public static void msg(String m, int l) {
        for (int i = 0; i < l; i++) {
            System.out.println(m);    
        } 
    }

    //Metodo soma parametros definidos
    public static int soma1(int n1, int n2, int n3){
        int res= n1+n2+n3;
        System.out.print("Soma: ");
        return res;
    }

    //Metodo soma parametros indefinido
    public static int soma2(int... numeros){
        int res=0;
        for (int n:numeros){
            res+=n;
        }
        System.out.print("Valores inteiro: ");
        return res;
    }

    //Metodo soma parametros indefinido (sem sobrecarga de metodo)
    public static Double soma2(double... numeros){
        Double res=0.0;
        for (double n:numeros){
            res+=n;
        }
        System.out.print("Valores double: ");
        return res;
    }
}
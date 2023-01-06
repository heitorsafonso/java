/*
CLASSE
- Classe é a representação de um objeto (Metodos, atributos), ela é indicada por class
- Instanciamos objetos de uma classe indicando o nome da classe , o nome do objeto, new, valor
- Instanciar é criar um objeto da classe (objetos independentes que segue as regras da classe)
- Cada objeto é individual e funciona atraves dos proprios metodos e atributos
- O new é reponsavel por reservar/alocar o espaco na head(memoria dinamica) para criar uma nova instancia
- Metodo construtor não tem retorno e deve ter o mesmo nome da classe, ele é executado assim que um objeto é instanciado na classe 

OBS: Sempre nomear classe com inicial maiuscula
O acesso é definido atraves dos modificadores public ou private

PUBLIC
- É possivel acessar fora da classe 

PRIVATE
- Acessado apenas dentro da propria classe
- funciona tanto para atributos quanto para metodos
- this. faz uma referencia para a propria classe 
- É utilizada para ter controle dos atributos no programa 

STATIC
- Elementos desse tipo tem sempre a mesma posicao na memoria
- Quando o elemento é alterado muda para todos os objetos
- this. não funciona com static
- Não precisa intanciar uma classe para chamar um metodo ou atributo static


*/

public class Classes{
    public static void main(String[] args) {

        int num=0;

        Jogador j1 = new Jogador(++num);
        Jogador j2 = new Jogador(++num);
        Jogador j3 = new Jogador(++num);

        //j1.setVidas(5);
        //j2.addVidas();
        //j2.addVidas();
        //j2.addVidas();

        Jogador.pontos();
        Jogador.pontos();
        Jogador.pontos();

        Jogador.alerta=true;

        j1.info();
        j2.info();
        j3.info();

        //System.out.printf("%nVidas do jogador 1:%d", j1.getVidas());
        //System.out.printf("%nVidas do jogador 2:%d", j2.getVidas());
        //System.out.printf("%nVidas do jogador 3:%d", j3.getVidas());

        //j1.num=10;
        //j2.num=5;
        //System.out.printf("%n%d",j1.num);
        //System.out.printf("%n%d",j2.num);
    }
}
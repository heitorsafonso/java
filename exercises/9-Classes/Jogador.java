public class Jogador {

    private final int maxVidas=3;
    private int num=0;
    private int vidas=0;
    static boolean alerta=false;
    static int qtdjogadores=0;
    static int pontoJogadores=0;

    //Metodo construtor
    public Jogador(int num){
        //num da classe = num do parametro de entrada;
        this.num = num;
        this.vidas=1;
        System.out.printf("%nJogador numero %d criado",num);
        qtdjogadores++;

    }

    // metodos GET servem para obter valores de variaveis de uma classe 
    public int getVidas(){  
        return this.vidas;
    }

    // metodos SET servem para atribuir valores de variaveis de uma classe
    public void setVidas(int vidas){
        if(vidas > maxVidas){
            this.vidas = maxVidas;
        }else if (vidas < 0) {
            this.vidas = maxVidas;
        } else {
            this.vidas = vidas;
        }
    }

    public void addVidas(){
        if(this.vidas < maxVidas){
            this.vidas++;
        }
    }

    static void pontos(){
        pontoJogadores+=10;
    }

    public void info(){
        System.out.printf("%nJogador: %d", this.num);
        System.out.printf("%nVidas: %d",this.vidas);
        System.out.printf("%nAlerta: %s", (alerta ? "Sim" : "Nao"));
        System.out.printf("%nJogadores: %d", qtdjogadores);
        System.out.printf("%nPontos jogador: %d", pontoJogadores);
        System.out.printf("%n---------------------------");
    }

}

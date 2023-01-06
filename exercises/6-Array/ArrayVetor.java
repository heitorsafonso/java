import java.util.Arrays;
import java.util.Scanner;

public class ArrayVetor{
    public static void main(String[] args) {
        //vetor();
        //gabarito();
        //classearray();
    }
    

    /*
    ARRAYS UNIDIMENCIONAIS (VETOR) 
    - É uma coleção de variáveis do mesmo tipo, todas na mesma estrutura, cada “variável” do array é chamada de elemento e podemos referenciar os elementos com um índice. 
    - Ao invés de criar n variáveis diferentes, podemos criar um array com n elementos, cada elemento irá armazenar um valor.
    - Para declarar basta usar os colchetes [ ] após o tipo de dados. 
    - O “new” é usado para alocar memória para o array e informar a quantidade de elementos do array.
    - Para inserir valores nas posições/elementos do array, basta informar a posição que deseja armazenar o valor. O primeiro elemento do array é o elementos de índice zero.
    - Podemos usar o loop for para ler ou preencher nosso array. 
    - A constante length retorna o tamanho (quantidade de posições/elementos) do array, bastante útil sempre que for preciso saber a quantidade de elementos de um array.
    - Podemos inserir os elementos do array na mesma linha de código em que o instanciamos.
    */
    public static void vetor(){
        final int tam=5;
        int[] num=new int[tam];
        int[] numeros= {10, 20, 30, 40, 50, 60, 70, 80, 90};
        
        num[0]=10;
        num[1]=5;
        num[2]=15;
        num[3]=0;
        num[4]=20;
        
        // Imprime vetor (exemplo 1)
        for(int i=0; i<tam; i++){
            System.out.printf("%d - ", num[i]);
        }
        System.out.println();
        
        // Imprime vetor (exemplo 2)
        for(int i=0; i<numeros.length; i++){
            System.out.printf("%d - ", numeros[i]);
        }
        System.out.println();

        // Imprime vetor (exemplo 3)
        for(int n:numeros){
            System.out.printf("%d - ",n);
        }
        System.out.println();
        
        //Retorna valor armazenado no indice 3
        System.out.printf("%d", numeros[3]);
    }

    public static void gabarito(){
        //GABARITO
        final int tam=5;
        char[] gabarito={'a', 'a', 'd', 'b', 'c'};
        char[] respostas=new char[tam];
        int nota=0;
        Scanner scan=new Scanner(System.in);
        
        for(int i=0; i<tam; i++){
            System.out.printf("Informe a resposta %d:", i);
            respostas[i]=scan.nextLine().charAt(0);
        }
        
        for(int i=0; i<tam; i++){
            if(respostas[i]==gabarito[i]){
                nota++;
            }
        }
        System.out.printf("Nota do aluno: %d", nota);
    }

    /*
    CLASSE ARRAY
    - Para usarmos a classe Array e seus métodos precisamos importar a biblioteca (import java.util.Arrays)

    - binarySearch: Faz uma busca em um array por um valor informado e retorna sua posição.
    Arrays.binarySearch(array, elemento_procurado);

    - copyOf: Copia os elementos de um array para outro array.
    arrayDestino = Arrays.copyOf(array_original, quantidade_de_elementos_a_serem_copiados);

    - copyOfRange: É semelhante ao “copyOf” mas permite informar um intervalo, uma faixa de valores a serem copiados
    arrayDestino = Arrays.copyOfRange(array_original, valor_inicial, valor_final);

    - equals: Faz a comparação de dois arrays, se forem iguais retorna “true” e se não forem retorna “false”.
    Arrays.equals(array_1, array_2);

    - fill: Preenche todo o array com o elemento indicado.
    Arrays.fill(array, valor);

    - sort: Ordena todos os elementos do nosso array em ordem crescente.
    Arrays.sort(array_a_ser_ordenado);
    */
    public static void classearray(){
        int tam=10;
        int[] num={9,2,7,1,8,5,3,4,0,6};
        int[] numeros=new int[tam];
        int[] copia=new int[tam];
        int p=8;
        int pos, posc, posf;
        
        System.out.print("\nORIGINAL: ");
        for(int i=0; i<num.length;i++){
            System.out.printf("%d - ",num[i]);
        }
        
        //COPY
        System.out.print("\nCOPIA: ");
        System.arraycopy(num, 0, copia, 0, tam);
        for(int n:copia){
            System.out.printf("%d - ",n);
        }
        
        //SORT
        Arrays.sort(copia);
        System.out.print("\nORDENADO: ");
        for(int i=0; i<copia.length;i++){
            System.out.printf("%d - ",copia[i]);
        }

        //FILL
        System.out.print("\nFILL: ");
        Arrays.fill(numeros, 10);
        for(int n:numeros){
            System.out.printf("%d - ",n);
        }
        
        //EQUALS
        System.out.printf("%n%nArrays são iguais: %s%n", Arrays.equals(num, numeros));
        System.out.printf("Arrays são iguais: %s%n", Arrays.equals(num, numeros) ? "Sim" : "Nao");
        
        //BINARY SEARCH
        pos = Arrays.binarySearch(num, p);
        posc = Arrays.binarySearch(copia, p);
        posf = Arrays.binarySearch(numeros, p);
        System.out.printf("O elemento %d esta no array ORIGINAL? %s na posicao %d%n",p,pos > 0 ? "Sim" : "Nao",pos);
        System.out.printf("O elemento %d esta no array COPIA (ORDENADO)? %s na posicao %d%n",p,posc > 0 ? "Sim" : "Nao",posc);
        System.out.printf("O elemento %d esta no array FILL? %s na posicao %d%n", p, posf > 0 ? "Sim" : "Nao", posf);
    }
}
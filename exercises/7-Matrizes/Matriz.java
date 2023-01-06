/*
ARRAYS BIDIMENCIONAIS (MATRIZ)
- São Arrays controlados por dois índices, como se tivéssemos um novo array dentro de cada elemento do array anterior. 
- Pode ser representado como uma tabela, com linhas e colunas.
- Usamos dois loops FOR, o primeiro para controlar as linhas e o segundo para controlar as colunas.
*/

import java.security.SecureRandom; // Fornece um gerador de números aleatórios criptograficamente forte (RNG).

public class Matriz{
    public static void main(String[] args) {
        final int linhas=3;
        final int colunas=5;
        int[][] numeros=new int[linhas][colunas];
        int[][] num={{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};

        //MATRIZ ALEATORIA DEFINE
        System.out.println("MATRIZ ALEATORIA: ");
        for(int l=0; l<linhas; l++){
            for(int c=0; c<colunas; c++){
                numeros[l][c]=new SecureRandom().nextInt(100);
            }
        }

        //IMPRIME MATRIZ  (exemplo 1)
        for(int l=0; l<linhas; l++){
            for(int c=0; c<colunas; c++){
                System.out.printf(" %2d ", numeros[l][c]);
            }
            System.out.println();
        }
        
        //IMPRIME MATRIZ (exemplo 2)
        System.out.println("\nMATRIZ: ");
        for(int[] n:num){
            for(int v:n){
                System.out.printf(" %2d ", v);
            }
            System.out.println();
        }

    }
}
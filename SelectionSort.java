package apa;

/**
 *
 * @author Carlinhos
 */
public class SelectionSort {

  

    public int[] selectionSort(int vetor[]) {
        int movimentacao = 0;
        long tempoInicial, tempoFinal;
        
        tempoInicial = System.currentTimeMillis();
        
        movimentacao++; // atribuição inicial o i = 0
        movimentacao++; // comparação do i com o tamanho do vetor
        
        // percorre todas as posições do vetor
        for (int i = 0; i < vetor.length; i++) {
            movimentacao++; // comparação do i com o tamanho do vetor

            movimentacao++; // atribuição do i a menor
            // atribui o menor índice a uma variável
            int menor = i;

            movimentacao++; // soma o i = 1
            movimentacao++; // atribuição inicial o j = i + 1
            movimentacao++; // comparação do i com o tamanho do vetor
            
            // percorre o vetor apartir do índice menor, para achar o menor valor do vetor
            for (int j = (i + 1); j < vetor.length; j++) {
                movimentacao++; // comparação do i com o tamanho do vetor

                movimentacao++; // leitura do vetor[j]
                movimentacao++; // leitura do vetor[menor]
                movimentacao++; // comparação do vetor[j] < vetor[menor] 
                
                // compara as posições do vetor
                if (vetor[j] < vetor[menor]) {

                    movimentacao++; // atribuição do j a menor
                   // achando o menor valor do vetor, atribua o seu índice a variável menor
                    menor = j;
                }

                movimentacao++; // incremento do j
            }

            movimentacao++; // leitura do vetor[j]
            movimentacao++; // leitura do vetor[menor]
            movimentacao++; // comparação do vetor[j] < vetor[menor] 

            // agora compara o valor do vetor[i] com o vetor[menor], se forem diferentes
            // faça a troca, depois incremente o i até o final e repita toda a operação
            // que ao final, o vetor está ordenado
//            if (vetor[i] != vetor[menor]) {
                if(i != menor){

                movimentacao++; // criação e atribuição do temp
                movimentacao++; // leitura do vetor[i]
                movimentacao++; // leitura do vetor[menor]
                movimentacao++; // atribuição do vetor[menor] para o  vetor[i]
                movimentacao++; // atribuição de temp para o  vetor[menor]
                int temp = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = temp;
            }

            movimentacao++; // incremento do i
        }

        tempoFinal = System.currentTimeMillis();
        System.out.println("InsertionSort - movimentos = " + movimentacao
                + "\nTempo de Ordenação = " + (tempoFinal - tempoInicial));
        return vetor;
    }
}

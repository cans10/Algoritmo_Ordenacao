package apa;

/**
 *
 * @author Carlinhos
 */
public class InsertSort {

    
    public int[] insertionSort(int[] vetor) {
        int movimentacao = 0;
        long tempoInicial, tempoFinal;

        tempoInicial = System.currentTimeMillis();

        movimentacao++; // atribuição o i
        movimentacao++; // comparação do i com o tamanho do vetor
        for (int i = 1; i < vetor.length; i++) {
            movimentacao++; // comparação do i com o tamanho do vetor

            movimentacao++; // leitura do vetor[i];
            movimentacao++; // atribuição do vetor[i] ao aux
            int aux = vetor[i];

            movimentacao++; // atribuição do i ao j
            int j = i;

            movimentacao++; // comparação do j com o 0
            movimentacao++; // subtração j - 1
            movimentacao++; // leitura do vetor[j-1];
            movimentacao++; // comparação do vetor[j-1] com aux
            while ((j > 0) && (vetor[j - 1] > aux)) {

                movimentacao++; // subtração j - 1
                movimentacao++; // leitura do vetor[j-1];
                movimentacao++; // atribuição do vetor[j-1] ao vetor[j]
                vetor[j] = vetor[j - 1];

                movimentacao++; // subtração j - 1
                movimentacao++; // atribuição j - 1 ao j
                j -= 1;
            }

            movimentacao++; // atribuição do aux ao vetor[j]
            vetor[j] = aux;

            movimentacao++; // incremento do i
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("InsertionSort - movimentos = " + movimentacao
                + "\nTempo de Ordenação = " + (tempoFinal - tempoInicial));
        return vetor;
    }
}

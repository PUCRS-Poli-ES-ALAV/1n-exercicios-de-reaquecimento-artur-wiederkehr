

public class Main{
    public static void main(String[] args) {
        //System.out.println(MultiplicacaoPorSoma(6,4));
        //System.out.println(SomaSucessiva(6,4));
        //System.out.printf("%.3f", SerieHarmonica(2));
        System.out.println(InverteString("Artur"));
        System.out.println(Fibonacci(5));
        System.out.println(SequenciaAckerman(3, 4));
        System.out.println(somaEProdutoVetor(new int[] {10,20,30})[0]);
        System.out.println(somaEProdutoVetor(new int[] {10,20,30})[1]);
        System.out.println(ehPalindromo("aaaaaa"));;
        System.out.println(ehPalindromo("bcd"));;


    }

// Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).
public static int MultiplicacaoPorSoma(int num1, int num2){
    if(num1 == 0){
        return 0;
    }
    else{
        return num2 + MultiplicacaoPorSoma(num1-1, num2);
    }
}

// Soma de dois números naturais, através de incrementos sucessivos (Ex.: 3 + 2 = + + (+ + + 1)).
public static int SomaSucessiva(int num1, int num2){
    if(num1 > 0){
        return 1 + SomaSucessiva(num1 - 1, num2);
    }
    if(num2 > 0){
        return 1 + SomaSucessiva(num1, num2 - 1);
    }
    return 0;
}

// Cálculo de 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.
public static float SerieHarmonica(int num) {
    if(num > 1){
        return 1 / num + SerieHarmonica(num - 1);
    }
    return 1;
}

// Inversão de uma string.
public static String InverteString(String palavra){
    int tamanho = palavra.length();
    if(tamanho == 0){
        return "";
    }
    else{
        return palavra.charAt(tamanho - 1) + InverteString(palavra.substring(0, tamanho - 1));
    }
}
// Gerador da sequência dada por:
// F(1) = 1
// F(2) = 2
// F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2).
public static int Fibonacci(int num){
    if(num > 1){
        return num * Fibonacci(num - 1);
    }
    return 1;
}
// Gerador de Sequência de Ackerman:
// A(m, n) = n + 1, se m = 0
// A(m, n) = A(m − 1, 1), se m != 0 e n = 0
// A(m, n) = A(m − 1, A(m, n − 1)), se m != 0 e n != 0.
public static int SequenciaAckerman(int m, int n){
    if(m == 0){
        return 1 + n;
    }
    if(m != 0 && n == 0){
        return SequenciaAckerman(m-1, 1);
    }
    if(m != 0 && n != 0){
        return SequenciaAckerman(m - 1, SequenciaAckerman(m, n - 1));
    }
    return 0;
}

// A partir de um vetor de números inteiros, calcule a soma e o produto dos elementos do vetor.
public static int[] somaEProdutoVetor(int[] vetor) {
    return somaEProdutoRec(vetor, vetor.length - 1);
}

private static int[] somaEProdutoRec(int[] vetor, int index) {
    if (index < 0) {
        return new int[]{0, 1};
    }
    int[] resultado = somaEProdutoRec(vetor, index - 1);
    return new int[]{resultado[0] + vetor[index], resultado[1] * vetor[index]};
}
// Verifique se uma palavra é palíndromo (Ex. aba, abcba, xyzzyx).
public static boolean ehPalindromo(String palavra) {
    if (palavra.length() <= 1) {
        return true; // Caso base: uma string de tamanho 0 ou 1 é um palíndromo
    }
    if (palavra.charAt(0) != palavra.charAt(palavra.length() - 1)) {
        return false; // Se o primeiro e o último caractere não forem iguais, não é palíndromo
    }
    return ehPalindromo(palavra.substring(1, palavra.length() - 1)); // Recursão
}
// Dado um número n, gere todas as possíveis combinações com as n primeiras letras do alfabeto. Ex.: n = 3. Resposta: ABC, ACB, BAC, BCA, CAB, CBA.
// Defina uma sequência de Fibonacci generalizada, de f0 a f1 como sequência fibg(f0, f1, 0), fibg(f0, f1, 1), fibg(f0, f1, 2), ..., onde:
// fibg(f0, f1, 0) = f0
// fibg(f0, f1, 1) = f1
// fibg(f0, f1, n) = fibg(f0, f1, n − 1) + fibg(f0, f1, n − 2), se n > 1.

}


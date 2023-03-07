import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Invertendo palavras!\n");
        System.out.print("Digite uma palavra: ");
        String palavra = entrada.next();
        String novaPalavra = "";

        for (int i = palavra.length() -1; i>=0; i--){
            novaPalavra+= Character.toString(palavra.charAt(i));

        }
        System.out.println(novaPalavra);
    }
}
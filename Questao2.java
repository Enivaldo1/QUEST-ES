//QUESTÃO 2

import java.util.Scanner;
public class Questao2
{
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1 =0, n2 = 1, n3 = 0;
        
        System.out.println("Consulta de sequência de Fibonacci");
        
        
        System.out.print("Digite um número: ");
        int valor = teclado.nextInt();
        
        while(valor > n3){
            n3 = n1+ n2;
            n1 = n2;
            n2 = n3;
        }
        
        if (valor ==0 || valor == 1){
            System.out.println("O número digitado faz parte da sequência de Fibonacci.");
            
        }else if(valor == n3){
            System.out.println("O número digitado faz parte da sequência de Fibonacci.");
            
        }else{
            System.out.println("O número digitado não faz parte da sequência de Fibonacci.");
        }
	}
}

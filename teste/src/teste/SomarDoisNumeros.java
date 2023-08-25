package teste;

import java.util.Scanner;

public class SomarDoisNumeros {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numero1, numero2;
        
        System.out.println("Digite um número:");
        numero1 = sc.nextInt();
        System.out.println("Digite outro número:");
        numero2 = sc.nextInt();
        
        int resultado = numero1 + numero2;
        
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + resultado);
    }
}

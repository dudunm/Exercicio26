package com.mycompany.exercicio26;
import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int qtd = 5;
        int vet[] = new int[5];   
        
        for(int i = 0; i < qtd; i++){
            System.out.print("Digite um número: ");
            int num = scan.nextInt();
            vet[i] = num;
        }
        int temp = 0;
        for(int i = 0; i < (qtd - 1); i++){
            for(int j = i+1; j < qtd;j++){
                if(vet[i] > vet[j]){
                    temp = vet[i];
                    vet[i] = vet[j];
                    vet[j] = temp;
                }
            }
        }
        for(int i = 0; i < qtd; i++){
            System.out.println(vet[i]);
        }
    }
}

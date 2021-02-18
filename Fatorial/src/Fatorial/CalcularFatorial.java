package Fatorial;

import java.util.Scanner;

public class CalcularFatorial {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int  fatorial = 1;
	
	        do{
	            System.out.println("Digite um número");
	            int numero = sc.nextInt();
	            
	            for(int i = 1; i <= numero; i++){
	            	fatorial = fatorial * i;
	            }
	            
	            System.out.println("Fatorial de "+ numero + " é = " + fatorial);
	            fatorial++;
	            
	       }while(fatorial < 2);
			
		}


	
}


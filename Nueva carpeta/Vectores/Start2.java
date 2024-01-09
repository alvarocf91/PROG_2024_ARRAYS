package Vectores;

import java.util.Arrays;

public class Start2 {

	public static void main(String[] args) {

		char frase[] = new char[10];
		frase[0] = 'y';
		frase[1] ='j';
		frase[2] = 'h';
		frase[3] = 'q';
		frase[4] = '-';
		frase[5] ='.';
		frase[6] =',';
		frase[7] ='+';
		frase[8] ='e';
		frase[9] ='r';
		
		for(int i=0; i<frase.length;i++) {
			//System.out.print("pos " +i+" = "+frase[i]);
			System.out.print(frase[i]);
		}
		
		System.out.println("");
		
		
		
		
		for(int i=frase.length-1; i>=0;i--) {
			System.out.print(frase[i]);
		}
		
		System.out.println("");


		
		
		for(char letra:frase) {
			System.out.println("Bucle avanzado :" +letra);
		}
		System.out.println("");
		
		
		
		String fraseEnString = Arrays.toString(frase);
		System.out.println(fraseEnString);
		
		System.out.println(frase.length);
		
		
		

	}

}

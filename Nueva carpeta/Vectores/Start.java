package Vectores;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {
				
		int temperaturas[] = new int[10];
		temperaturas[4]= -2;
		temperaturas[0]= 20;
		temperaturas[1]= 4;
		temperaturas[2]= 23;
			
		String miArray = Arrays.toString(temperaturas);
		System.out.println(miArray);
		//dos formas
		System.out.println(Arrays.toString(temperaturas));

		System.out.println(temperaturas.length);
		
	}

}

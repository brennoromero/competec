/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[][] tabela = new int[2][2];
		tabela[1][1]= 5;
		tabela[0][0]= 9;
		tabela[1][0]= 52;
		tabela[0][1]= 16;
		for(int i = 0; i < 2; i++){
		    for(int j = 0; j < 2; j++){
		        System.out.print(tabela[i][j] + " ");
		    }
		    
		}
		
		/*
		System.out.print(tabela[0][0] + " ");
		System.out.print(tabela[0][1] + " ");
		System.out.println(" ");
		System.out.print(tabela[1][0] + " ");
		System.out.print(tabela[1][1] + " ");
		System.out.println(" ");
		*/
		
		 
		
	}
}

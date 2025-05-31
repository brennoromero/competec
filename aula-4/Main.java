import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    //primeiro codigo
	   
	    int max = 1000;
	    
	    int contador =0;
	    
	    while(contador <= max){
	        if(contador % 10 == 0)
	      		System.out.println(contador);  
	      		contador++;
	    }
	    
	    //segundos codigo
	    
	    int numeros [] = {1, 3 ,5};
	    int soma = numeros[0] + numeros[1] + numeros[2];

       System.out.println(soma);
      
       //terceiro codigo
       
       
       System.out.println("digite essa porra");
       Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
       int valores[] = new int[n];
       
       for(int i = 0; i < valores.length; i++){
           valores[i] = scan.nextInt();
       }
        for(int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
           
       }
       

	}
}

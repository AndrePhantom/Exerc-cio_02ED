package View;

public class Main {

	
	static int numeroBinario(int n) {
	    if(n > 0) {    // chamada n�mero inteiro
	        numeroBinario(n/2); // condi��o de parada
	        System.out.print(n % 2);
	        return n; 
	    }
	    return n;
	}
}					
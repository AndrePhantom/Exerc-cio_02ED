package View;

public class Main {

	
	static int numeroBinario(int n) {
	    if(n > 0) {    // chamada número inteiro
	        numeroBinario(n/2); // condição de parada
	        System.out.print(n % 2);
	        return n; 
	    }
	    return n;
	}
}					
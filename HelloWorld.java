import java.util.*;

public class HelloWorld{
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args){
		
		System.out.print("Calculador de numeros Primos!");
		System.out.print("Escolher o maximo: ");
		
		if(userInput.hasNextInt()){
			int max =  Math.abs(userInput.nextInt());
			if(max == 0){
				System.out.println("O maximo não pede ser 0!");
			}else{
				System.out.println("Maximo defedido para: " + max);
				System.out.println("Os numeros primos entre 0 e " + max + "são:");
				
				int i = 1;
				
				while(i <= max){
					
					
					if(i==2){
						System.out.println(i);
						i++;
						continue;
					}
								
					if((i%i)==0 && (i%2) != 0){
						
						System.out.println(i);
						i++;
						continue;
						
					}
					
					i++;
					
					
				}
			}
			
			
		}else{
			System.out.println("Proxima Vez Escreva um Numero!");
		}
		
				
	}
	
}
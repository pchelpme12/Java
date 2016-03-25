import java.util.Scanner;

public class primos_patched{
	
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.println("numeros primos (patch das 2:40 da manhã :D)");
		System.out.println("escolher um numero Maximo!");
		if(userInput.hasNextInt()){
			int max = userInput.nextInt();
			for(int i=2;i<=max;i++){
				for(int a=2;a<=i;a++){
					if(a==i){
						System.out.println(i);
					}
					if(i%a==0){
						break;
					}
				}
			}
		}else{
			System.out.println("next time type a number");
		}
	}
}
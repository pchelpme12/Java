import java.util.Scanner;

public class primos{
	
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args){
		
		System.out.println("prime numbers calculator!");
		System.out.println("choose the minimum: ");
		if(userInput.hasNextInt()){
			int min = userInput.nextInt();
			System.out.println("Minio é: " + min);
			System.out.println("Escolher o máximo!: ");
			if(userInput.hasNextInt()){
				int max = userInput.nextInt();
				int i = min;
				while(i <= max){
					
					if(i == 2){
						System.out.println(i);
						i++; continue;
					}
					if(i == 3){
						System.out.println(i);
						i++; continue;
					}
					if(i == 5){
						System.out.println(i);
						i++; continue;
					}
					if(i == 7){
						System.out.println(i);
						i++; continue;
					}
					
					
					if((i%2)!=0){
						if((i%3) != 0){
							if((i%4) != 0){
								if((i%5) != 0){
									if((i%6) != 0){
										if((i%7) != 0){
											if((i%8) != 0){
												if((i%9) != 0){
													if((i%10) != 0){
														System.out.println(i);
														i++;
													}i++; continue;
												}i++; continue;
											}i++; continue;
										}i++; continue;
									}i++; continue;
								}i++; continue;
							}i++; continue;
						}i++; continue;
						
					}i++; continue;
				}
			}else{
				System.out.println("fk off");
			}
			
			
		}else{
			System.out.print("introduzir um numero da proxima vez!");
		}
		
		
	}
	
}
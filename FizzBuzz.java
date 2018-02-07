import java.util.Scanner;
public class FizzBuzz {
	public static void main(String[] args) {
		int x = 0;
		String s;
		boolean safe = true;
		Scanner read = new Scanner(System.in);
		for(int i = 1; i <=100; i++){
			
			if(i%3 == 0 && i%5 ==0){
				
				if(read.hasNextInt()){
					safe = false;
				}
				s =read.next();
				if(!s.equals("FizzBuzz")){
					safe = false;
				}
			}
			else if(i%3 == 0){
				
				if(read.hasNextInt()){
					safe = false;
				}
				s =read.next();
				if(!s.equals("Fizz")){
					safe = false;
				}
			}
			else if(i%5 == 0){
				if(read.hasNextInt()){
					safe = false;
				}
				s = read.next();
				if(!s.equals("Buzz")){
					safe = false;
				}
			}
			else if(i%5 != 0 && i%3 != 0){
				if(read.hasNextInt()){
					x = read.nextInt();
				}
				else{
					safe = false;
				}
			}
			if(!safe){
				System.out.println("Oh my! You messed up!");
				break;
			}
			
		}
	}
}

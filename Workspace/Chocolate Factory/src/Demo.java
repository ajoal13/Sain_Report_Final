import java.util.Scanner;

public class Demo extends ChocolateBoiler{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int selection;
		Scanner keyboard = new Scanner(System.in);
		boolean exit = false;		
		
		while (exit == false){
		
		System.out.println("Press 1 for Fill, 2 for Boil, and 3 for Dump, 4 to exit");
			
		selection = keyboard.nextInt();
		
		if (selection == 1){
			fill();
			}

		if (selection == 2){
			boil();
		}
	
		if (selection == 3){
		drain();
			}
	
		if (selection == 4){
		exit = true;
		System.out.println("Thanks for using the program");
	}
	
		}		
		keyboard.close();
	}
}
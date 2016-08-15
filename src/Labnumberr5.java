import java.util.Scanner;

public class Labnumberr5 {
	
	public static void main(String args[]) {
		
Scanner sc = new Scanner (System.in);
String choice = "y";
String number = "n";
while (true){
System.out.println("Welcome to the Game of Dice!");
System.out.println("Roll the Dice? (y/n)");
choice = sc.nextLine();
System.out.println();

if (choice.equalsIgnoreCase("y")){
	System.out.println("Let's Go!");

	System.out.println("Enter the Number of Sides for a pair of Dice");
	int n = Integer.parseInt (sc.nextLine());
	System.out.println("Great! You chose"  +  n);
	
	//System.out.println("Roll:");
	//String x = "dice1";
	//String y = "dice2";
	//String x1 = sc.nextLine();
	//String y1 = sc.nextLine();
	
	int dice1 = 1;
	int dice2 = 1;
	int count = 0;
	
	dice1 = (int) (Math.random() * 8 + 1);

    dice2 = (int) (Math.random() * 8 + 1);

    count++;

    System.out.println("Roll " + count +":");            

    System.out.println(dice1);           

    System.out.println(dice2);
    
    
	System.out.println("Roll Again?");
	choice = sc.nextLine();
	System.out.println();}
	
	else {System.out.println("Come Again!");
			

	System.out.println("See You Later! (y/n)");
}


	
	break;
	 
	}

sc.close();
}
}
import java.util.Scanner;
/*
 * Qihui Guo
 */
public class Drive {

	public static void main(String[] args) {

		// do while to ask user try again
		String answer = "";
		do {
		
		//get input from user	
		Scanner myScan= new Scanner(System.in);
		
		System.out.print("What is your manufacturer?");
		String Manufacturer=myScan.nextLine();

		System.out.print("What is your model?");
		String Model=myScan.nextLine();
		
		System.out.print("What is your price?");
		int Price=myScan.nextInt();
		
		System.out.print("What is your carrier?");
		String Carrier=myScan.next();
		
		System.out.print("What is your phonenumber?");
		String phonenumber=myScan.next();
		
		System.out.print("What message you want to send in?");
		String message=myScan.next();
		
		//making an object
		Phone myPhone= new Phone(Manufacturer,Model,Price,Carrier);
		
		//print out all information
		System.out.println(myPhone);
		System.out.println(myPhone.call(phonenumber));
		System.out.println(myPhone.text(message));
		System.out.println("Try again?");
		Scanner choice = new Scanner(System.in);
		answer = choice.nextLine();
		
	}while(answer.equalsIgnoreCase("Y"));
	}

}

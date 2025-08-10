import java.util.Scanner;
public class ScannerEx
{
  //public :  Access Modifier
  //static : To access a class we need object.. but we can run without the member functions without objects with the help of static functions
  //void : Return type of the function
  //main : Main function
  //String [] : Parameter as an array of String datatype
  //args : Command line arguments to get input from the terminal

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);      		//Creating Scanner object
	    System.out.print("Enter your age : ");    
	    int age = sc.nextInt();                   		//Integer input
	    
	    System.out.print("Enter your name : ");
	    sc.nextLine();                             		//-------------------- To get the new line pressed by the user after getting numeric values-------------------
	    String name = sc.nextLine();                	//String input
	    
	    System.out.print("Enter float value : ");
	    float fval = sc.nextFloat();                   	//Float input
		
		System.out.print("Enter true or false : ");
		boolean bval = sc.nextBoolean();               	//Boolean input
		
		System.out.println("\nAge : "+age);  
		System.out.println("Name : "+name);            	//print() -> cursor will be at the same line after printing
		System.out.println("Float : "+fval);          	//println() -> cursor will be at the new line after printing
		System.out.println("Bool :"+bval);
		
		sc.close();                                   	//Closing the object
	}
}

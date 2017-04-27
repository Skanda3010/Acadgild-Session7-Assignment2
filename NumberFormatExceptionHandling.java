import java.util.Scanner;

public class NumberFormatExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String somString;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter something!!");
		somString = sc.next();
		sc.close();
		
		try{
			int num = Integer.parseInt(somString);
			System.out.println("The num value is :"+num);
		}catch (NumberFormatException e){
			e.printStackTrace();
			System.out.println("Exception!! THe integer value of the given string could not be parsed");
		}

	}

}

import java.util.*;
public class Q1 
{
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		String inputString= sc.nextLine();
		String reverseString="";
		for(int i= inputString.length()-1; i>=0;i--) {
			reverseString+=inputString.charAt(i);
		}
		System.out.println("reverse of the String= "+ reverseString);
	}
}

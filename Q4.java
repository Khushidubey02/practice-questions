import java.util.*;
public class Q4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String ogString = sc.nextLine();

        System.out.print("Enter the index to replace the character: ");
        int i = sc.nextInt();

        System.out.print("Enter the new character: ");
        char newChar = sc.next().charAt(0);

        if (i < 0 || i >= ogString.length()) 
        {
            System.out.println("Index is out of range");
        } else 
        {          
        	 char[] charArray = ogString.toCharArray();
             charArray[i] = newChar;
             String modified = new String(charArray);            
            System.out.println("Modified string: "+ modified);
        }
    }
}
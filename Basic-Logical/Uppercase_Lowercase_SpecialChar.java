import java.util.Scanner;
public class Uppercase_Lowercase_SpecialChar {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);
        if(Character.isUpperCase(ch))
        {
            System.out.println("Uppercase");
        }
        else if(Character.isLowerCase(ch))
        {
            System.out.println("Lowercase");
        }
        else
        {
            System.out.println("Special character");
        }
        sc.close();
    }
}

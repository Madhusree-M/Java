import java.util.*;
public class Ascii_value_of_a_char
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);
        System.out.println("Ascii value of "+ch+" is "+(int)ch);
        sc.close();
    }

}
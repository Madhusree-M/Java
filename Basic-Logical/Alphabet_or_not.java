import java.util.Scanner;

public class Alphabet_or_not{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);

        if(Character.isLetter(ch))
        {
            System.out.format("%c is an alphabet\n",ch);
        }
        else
        {
            System.out.format("No, %c is not an alphabet\n",ch);
        }
        sc.close();
    }
}
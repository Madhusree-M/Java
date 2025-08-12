import java.util.*;

public class Vowel_or_Consonant{
    public static void main(String[] args)
    {
        System.out.print("Enter an alphabet : ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.printf("%c is a vowel\n",ch);
        }
        else{
            System.out.printf("%c is a consonant\n",ch);
        }
        sc.close();
    }
}
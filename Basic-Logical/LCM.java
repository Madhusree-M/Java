import java.util.Scanner;

public class LCM {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        //System.out.println(y);
        int i = Math.max(x,y);
        int maxi = x*y;
        while(i<=maxi)
        {
            if((i%x==0)&&(i%y==0))
            {
                System.out.println("LCM = "+i);
                break;
            }
            i++;
        }
        sc.close();
    }
}

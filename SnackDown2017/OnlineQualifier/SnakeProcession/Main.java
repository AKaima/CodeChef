package CodeChef.SnackDown2017.OnlineQualifier.SnakeProcession;

import java.util.Scanner;

/**
 * Created by kaima on 5/23/17.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++)
        {
            int l = scan.nextInt();
            String s = scan.next();

            /*
                All of the following text can simply be replaced by:
                System.out.println(s.replaceAll("\\.", "").replaceAll("HT", "").equals("") ? "Valid" : "Invalid");
             */
            boolean valid = true;
            char last = 'T';

            for(int j = 0; j < l; j++)
            {
                if(last == 'T' && s.charAt(j) == 'T')
                {
                    valid = false;
                    break;
                }
                if(last == 'H' && s.charAt(j) == 'H')
                {
                    valid = false;
                    break;
                }
                if(last == 'T' && s.charAt(j) == 'H')
                    last = 'H';
                else if(last == 'H' && s.charAt(j) == 'T')
                    last = 'T';
            }

            if(last == 'H')
                valid = false;

            System.out.println(valid ? "Valid" : "Invalid");
        }
    }
}

package Happy_Ticket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 01.05.2015.
 */
public class Happy_ticket {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the number of ticket: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();

        int num;

        final int MIN_TICKET_VALUE = 100000;
        final int MAX_TICKET_VALUE = 999999;
        try{
            num = Integer.parseInt(s1);

            if ((num < MIN_TICKET_VALUE) || (num > MAX_TICKET_VALUE)) {
                System.out.println("Oops, not a ticket");
            } else {
                if (if_happy(num) == true) {System.out.println("Happy!");}
                else {System.out.println("Not happy :(");}
            }
        }
        catch (NumberFormatException e){
            System.out.println("Entered invalid characters. Try again and use only numbers.");
        }

    }

    public static boolean if_happy(int n){
        int sum1 = half_sum(n % 1000);
        int sum2 = half_sum(n / 1000);
        if (sum1 == sum2) {return true;}
        else {return false;}
    }

    //вычисляем сумму трех цифр
    public static int half_sum(int n){
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}

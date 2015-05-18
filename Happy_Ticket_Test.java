package Happy_Ticket;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by User on 18.05.2015.
 */
public class Happy_Ticket_Test {
    int halfSum;
    int ticketNumber;

    @Before
    public void setUP(){
        halfSum = 123;
        ticketNumber = 123123;
    }

    @Test
    public void testHalfSum(){
        Assert.assertTrue(Happy_ticket.half_sum(halfSum) == 6);
    }

    @Test
    public void testIfHappy(){
        Assert.assertTrue(Happy_ticket.if_happy(ticketNumber) == true);
    }

}

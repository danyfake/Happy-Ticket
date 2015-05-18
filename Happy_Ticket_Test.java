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
        Assert.assertTrue(Happy_ticket.if_happy(ticketNumber));
    }

    @Test
    public void testCheckCondition0(){
        int ticket = 100000;
        Assert.assertTrue(Happy_ticket.checkCondition(ticket));
    }

    @Test
    public void testCheckCondition1(){
        int ticket = 999999;
        Assert.assertTrue(Happy_ticket.checkCondition(ticket));
    }

    @Test
    public void testCheckCondition2(){
        int ticket = 123501;
        Assert.assertTrue(Happy_ticket.checkCondition(ticket));
    }

    @Test
    public void testCheckCondition3(){
        int ticket = 1234567;
        Assert.assertTrue(Happy_ticket.checkCondition(ticket) == false);
    }

    @Test
    public void testCheckCondition4(){
        int ticket = 12345;
        Assert.assertTrue(Happy_ticket.checkCondition(ticket) == false);
    }
}

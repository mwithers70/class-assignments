package ConcertTicket;

import org.junit.Test;

import static org.junit.Assert.*;

public class WalletTest {

    @Test
    public void setSize() {
            }

    @Test
    public void add() {
        Wallet wallet = new Wallet();
        ConcertTicket ticket = new ConcertTicket();

//        wallet.add(ticket);
//        assertEquals(wallet.tickets[wallet.getSize()], ticket);
     ConcertTicket returnTicket = wallet.add(ticket);
     assertEquals(wallet.tickets [wallet.getSize() -1], ticket);
     assertEquals(wallet.tickets [wallet.getSize() -1], returnTicket);
     assertEquals(ticket, returnTicket);
     assertTrue(true);

    }

    @Test
    public void resize() {
    }

    @Test
    public void getSize() {
        Wallet wallet = new Wallet();
        ConcertTicket ticket = new ConcertTicket();
        assertTrue(wallet.getSize() == 0);
        ConcertTicket returnTicket = wallet.add(ticket);
        assertTrue(wallet.getSize() ==1);
        assertEquals(wallet.getSize(), 1);
    }
}
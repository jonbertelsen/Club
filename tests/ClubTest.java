import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClubTest {

    Club club;

    @Before
    public void setUp() throws Exception {
        club = new Club("Rønne IF", "Nordvej 23");
    }

    @Test
    public void getClubName() {
        assertEquals("Rønne IF", club.getClubName());
    }

    @Test
    public void setClubName() {
        club.setClubName("Bodilsker United");
        assertEquals("Bodilsker United", club.getClubName());
    }

    @Test
    public void addMember() {
        assertEquals(0,club.getNoOfMembers());
        club.addMember(new Member("Jamie Lannister", 1985, true));
        assertEquals(1,club.getNoOfMembers());
        assertEquals("Jamie Lannister", club.getMembers()[0].getName());
    }
}
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {

    Member member;

    @Before
    public void setUp() throws Exception {
        member = new Member("Jon Snow", 1975, true);
    }

    @Test
    public void getFee() {
        assertEquals(250, member.getFee());
        member.setActiveMember(false);
        assertEquals(100, member.getFee());
        member.setBirthYear(1980);
        assertEquals(200, member.getFee());
        member.setActiveMember(true);
        assertEquals(350, member.getFee());
        member.setBirthYear(2001);
        assertEquals(450, member.getFee());
        member.setActiveMember(false);
        assertEquals(300, member.getFee());
    }
}
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Bob");
    }

    @Test
    public void hasName(){
        Assert.assertEquals("Bob", guest.getName());
    }
}

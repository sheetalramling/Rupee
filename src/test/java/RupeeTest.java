import Rupee.Rupee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RupeeTest {
    @Test
    void oneTenRupeesIsNotSameAsAnotherTenRupees() {

        Rupee oneTenRupee = new Rupee(10);
        Rupee anotherTenRupee = new Rupee(10);

        assertNotSame(oneTenRupee, anotherTenRupee);

    }

    @Test
    void oneTenRupeesIsEqualToAnotherTenRupees() {

        Rupee oneTenRupee = new Rupee(10);
        Rupee anotherTenRupee = new Rupee(10);

        assertEquals(oneTenRupee,anotherTenRupee);

    }

    @Test
    void tenRupeeIsNotEqualToFiveRupee() {

        Rupee tenRupee = new Rupee(10);
        Rupee fiveRupee = new Rupee(5);

        assertNotEquals(tenRupee,fiveRupee);
    }

    @Test
    void tenRupeesIsnNotNull() {

        Rupee tenRupee = new Rupee(10);

        assertNotEquals(tenRupee,null);
    }

    @Test
    void tenRupeeIsNotSameAsAnotherObject() {

        Rupee tenRupee = new Rupee(10);
        Object anotherObject=new Object();

        assertNotEquals(tenRupee,anotherObject);
    }
}

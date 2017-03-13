package utility;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * Created by CAMT on 3/13/2017.
 */
public class CurrencyTest {
    @Test
    public void testExchange(){
        Currency currency= new Currency();
        assertThat(currency.exchange("USD",1.0,"USD"),closeTo(1.0,0.001));
    }
}

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UnknownCodeTest {
    @Test
    public void ZeroReturnsZero() throws Exception {
        UnknownCode unknownCode = new UnknownCode();
        assertThat(unknownCode.getNumber(0), is(0));
    }
}
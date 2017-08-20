package com.greatersum.unknowncode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UnknownCodeTests {
    @Test
    public void ZeroIsZero() throws Exception {
        UnknownCode unknownCode = new UnknownCode();
        assertThat(unknownCode.getNumber(0), is(0));
    }
}

package name.wilu.sut;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SutTest {

    @Test
    public void shouldMultiplyByTwo() throws Exception {
        assertThat(new Sut().multiplyByTwo(2), is(4));
    }

}
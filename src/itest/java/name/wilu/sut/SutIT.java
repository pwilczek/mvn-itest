package name.wilu.sut;


import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.FileInputStream;
import java.util.Properties;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Category(IT.class)
public class SutIT {

    private Properties properties = new Properties();

    @Before
    public void setUp() throws Exception {
        FileInputStream f = new FileInputStream("src/itest/resources/test.properties");
        properties.load(f);
    }

    @Test
    public void shouldMultiplyByTwo() throws Exception {
        assertThat(new Sut().multiplyByTwo(get("input")), is(get("expected")));
    }

    private int get(String key) {
        return Integer.parseInt(properties.get(key).toString());
    }
}

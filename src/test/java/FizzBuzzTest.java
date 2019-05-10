import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


/**
 * @ClassName FizzBuzzTest
 * @Description TODO
 * @Author yyy
 * @Date 2019/5/8 16:18
 * @Version 1.0-
 **/
public class FizzBuzzTest {
    @Test
    public void testFizzBuzz() {
        assertThat(FizzBuzz.of(3)).isEqualTo("Fizz");
        assertThat(FizzBuzz.of(5)).isEqualTo("Buzz");
        assertThat(FizzBuzz.of(15)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzz.of(4)).isEqualTo("4");
    }
}

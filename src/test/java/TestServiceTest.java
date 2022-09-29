import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TestServiceTest {

    TestService testService = new TestService();

    @Test
    void test1() {
        Assertions.assertEquals(1, testService.test());
    }
}

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IsPositiveNumberTest {
    //Проверьте работу метода на числах 555, 0 и -555.
    IsPositiveNumber ai;
    @BeforeEach
    void setUp(){
        ai = new IsPositiveNumber();
    }
    @Test
    @Order(1)
    public void testIsPositiveNumberHappyPath() {
        int input = 555;
        boolean expectedResult = true;
        boolean actualResult = ai.IsPositiveNumberAlgorithm(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    @Order(2)
    public void testIsPositiveNumberHappyPathNegative() {
        int input = -555;
        boolean expectedResult = false;
        boolean actualResult = ai.IsPositiveNumberAlgorithm(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    @Order(3)
    public void testIsPositiveNumberHappyPathZero() {
        int input = 0;
        boolean expectedResult = true;
        boolean actualResult = ai.IsPositiveNumberAlgorithm(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }

}

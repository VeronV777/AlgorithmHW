
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {
    //Test Data:
    //3333, 9999
    //Expected Result = 9999
    BiggerValue ai;
    @BeforeEach
    void setUp(){
        ai = new BiggerValue();
    }
    @Test
    @Order(1)
    public void testBiggerValueHappyPath() {
        int input = 3333;
        int imput2 = 9999;
        int expectedResult = 9999;
        BiggerValue ai = new BiggerValue();
        int actualResult = ai.BiggerValueAlgorithm(input, imput2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testBiggerValueHappyPathNegative() {
        int input = -888;
        int imput2 = -9999;
        int expectedResult = -888;

        int actualResult = ai.BiggerValueAlgorithm(input, imput2);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    @Order(3)
    public void testBiggerValueHappyPathEqual() {
        int input = 888;
        int imput2 = 888;
        int expectedResult = 0;

        int actualResult = ai.BiggerValueAlgorithm(input, imput2);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
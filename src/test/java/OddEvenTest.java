import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OddEvenTest {
    //Test Data:
//-345 →  “Odd”
//0 →  “Even”
//222222 →  “Even”
//2147483647 + 1 →  “Undefined”
    @Test
    @Order(1)
    public void testOddEvenHappyPathPositiveNumber() {
        long number = 222222;
        String expectedResult = "Even";
        OddEven as = new OddEven();
        String actualResult = as.OddEvenAlgorithm(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testOddEvenHappyPathPNegativeNumber() {
        long number = -345;
        String expectedResult = "Odd";
        OddEven as = new OddEven();
        String actualResult = as.OddEvenAlgorithm(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    @Order(3)
    public void testOddEvenHappyPathZero() {
        long number = 0;
        String expectedResult = "Even";
        OddEven as = new OddEven();
        String actualResult = as.OddEvenAlgorithm(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    @Order(4)
    public void testOddEvenHappyPathLong() {
        long number = (2147483647L+1);
        String expectedResult = "Undefined";
        OddEven as = new OddEven();
        String actualResult = as.OddEvenAlgorithm(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
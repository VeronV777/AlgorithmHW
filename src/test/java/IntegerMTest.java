import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IntegerMTest {
 //Given an integer M perform the following conditional actions:
    //If M is multiple of 3 and 5 then return "Good Number".
    //If M is only multiple of 3 and not of 5 then return "Bad Number"
    //If M is only multiple of 5 and not of 3 then return "Poor Number"
    //If M doesn't satisfy any of the above conditions then return "-1"
 IntegerM ai;
    @BeforeEach
    void setUp(){
        ai = new IntegerM();
    }
    @Test
    @Order(1)
    public void testIntegerMGoodNumber() {
        int input = 15;
        String expectedResult = "Good Number";
        String actualResult = ai.IntegerMAlgorithm(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    @Order(2)
    public void testIntegerMBadNumber() {
        int input = 9;
        String expectedResult = "Bad Number";
        String actualResult = ai.IntegerMAlgorithm(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    @Order(3)
    public void testIntegerMBPoorNumber() {
        int input = -10;
        String expectedResult = "Poor Number";
        String actualResult = ai.IntegerMAlgorithm(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    @Order(4)
    public void testIntegerMNotMatch() {
        int input = -11;
        String expectedResult = "-1";
        String actualResult = ai.IntegerMAlgorithm(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    @Order(5)
    public void testIntegerMZero() {
        int input = 0;
        String expectedResult = "Good Number";
        String actualResult = ai.IntegerMAlgorithm(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}

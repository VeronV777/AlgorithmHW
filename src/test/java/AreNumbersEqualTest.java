
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//Test Data:
//89, 89
//Expected result: 0
//-89, 89
//Expected result: -1
//89, -89
//Expected result: 1

public class AreNumbersEqualTest {
     AreNumbersEqual ai;
    @BeforeEach
    void setUp(){
            ai = new AreNumbersEqual();
        }
    @Test
    @Order(1)
    public void testAreNumbersEqualHappyPathZero() {
        int input = 89;
        int input2 = 89;
        int expectedResult = 0;
        int actualResult = ai.AreNumbersEqualAlgorithm(input, input2);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    @Order(2)
    public void testAreNumbersEqualHappyPathBigger() {
        int input = 89;
        int input2 = -89;
        int expectedResult = 1;
        int actualResult = ai.AreNumbersEqualAlgorithm(input, input2);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    @Order(3)
    public void testAreNumbersEqualHappyPathSmaller() {
        int input = -89;
        int input2 = 89;
        int expectedResult = -1;
        int actualResult = ai.AreNumbersEqualAlgorithm(input, input2);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    }


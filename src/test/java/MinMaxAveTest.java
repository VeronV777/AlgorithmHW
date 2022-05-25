
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MinMaxAveTest {
//Test Data:
// ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
MinMaxAve ai;
    @BeforeEach
    void setUp() {
        ai = new MinMaxAve();
    }
      @Test
        @Order(1)
        public void testMinMaxAveHappyPath() {
            int [] input = {1, 2, 3, 4, 5, 6, 7, 8};
            int input1 = 2;
            int input2 = 6;
            int  [] expectedResult = {3, 7, 5};

            int [] actualResult =ai.MinMaxAveAlgorithm(input, input1, input2);
            Assertions.assertArrayEquals(expectedResult, actualResult);
        }
}

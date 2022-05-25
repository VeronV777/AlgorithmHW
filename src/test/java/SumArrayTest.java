import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)



public class SumArrayTest {
  //  Test Data:
   // {0, 1, 2, 3, 4, 5} → 15
  //  {-7, -3} → -10
  SumArray ai;
    @BeforeEach
  void setUp(){
      ai = new SumArray();
  }

    @Test
    @Order(1)
    public void testSumArrayHappyPath() {
        int [] input = {0, 1, 2, 3, 4, 5};
        int  expectedResult = 15;
        SumArray ai = new SumArray();
        int  actualResult =ai.SumArrayAlgorithm(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    @Order(2)
    public void testSumArrayHappyPathNegative() {
        int [] input = {-7, -3};
        int  expectedResult = -10;
        int  actualResult =ai.SumArrayAlgorithm(input);
        Assertions.assertEquals(expectedResult, actualResult);
}}


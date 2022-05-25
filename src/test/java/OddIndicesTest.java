import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OddIndicesTest {

    //Input = {-45, 590, 234, 985, 12, 68}
    //Expected Result =  {590, 985, 68}
    @Test
    @Order(1)
    public void testOddIndicesPath() {
        int [] input = {-45, 590, 234, 985, 12, 68};
        int [] expectedResult = {590, 985, 68};
        OddIndices ai = new OddIndices();
        int [] actualResult =ai.OddIndicesAlgorithm(input);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}

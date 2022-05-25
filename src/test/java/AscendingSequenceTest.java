import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AscendingSequenceTest {
    AscendingSequence ascendingSec;

    //object fo every test
    @BeforeEach
    void setUp(){

        ascendingSec = new AscendingSequence();
    }
    @Order(1)
    @RepeatedTest(10)
    @Test
    public void testAscendingSequenceHappyPass() {
        //0, 1, 2, 3, 4, 5
        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};
        AscendingSequence ascendingSec = new AscendingSequence();
        // ascendingSec.AscendingSequenceAlg(start, end, step);//call method
        int[] actualResult = ascendingSec.AscendingSequenceAlg(start, end, step);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
@Order(2)
    @Test
    public void testAscendingSequenceHappyPassNegative() {
        //-10, -9, -8, -7, -6, -5
        int start = -10;
        int end = -5;
        int step = 1;
        int[] expectedResult = {-10, -9, -8, -7, -6, -5};
        AscendingSequence ascendingSec = new AscendingSequence();
        int[] actualResult = ascendingSec.AscendingSequenceAlg(start, end, step);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
@Order(3)
    @Test
    public void testAscendingSequenceHappyPassNegativePositive() {
        //-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5
        int start = -5;
        int end = 5;
        int step = 1;
        int[] expectedResult = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        AscendingSequence ascendingSec = new AscendingSequence();
        int[] actualResult = ascendingSec.AscendingSequenceAlg(start, end, step);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
@Order(4)
    @Test
    public void testAscendingSequenceStepTwo() {
        //0, 2, 4
        int start = 0;
        int end = 5;
        int step = 2;
        int[] expectedResult = {0, 2, 4};
        AscendingSequence ascendingSec = new AscendingSequence();
        // ascendingSec.AscendingSequenceAlg(start, end, step);//call method
        int[] actualResult = ascendingSec.AscendingSequenceAlg(start, end, step);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStartLargeEnd() {
        int start = 5;
        int end = 0;
        int step = 1;
        int[] expectedResult = {}; //empty array
        AscendingSequence ascendingSec = new AscendingSequence();
        int[] actualResult = ascendingSec.AscendingSequenceAlg(start, end, step);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStepNegative() {
        int start = 5;
        int end = 0;
        int step = -1;
        int[] expectedResult = {}; //empty array


        int[] actualResult = ascendingSec.AscendingSequenceAlg(start, end, step);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStepZero() {
        int start = 5;
        int end = 0;
        int step = 0;
        int[] expectedResult = {}; //empty array

        int[] actualResult = ascendingSec.AscendingSequenceAlg(start, end, step);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}

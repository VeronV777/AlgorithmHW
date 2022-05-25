
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//Test Data:
//{1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
//{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
//{1, 2, 4, 5, 89}, {8, 9, 45} → {}

public class IntersectionTest {
    Intersection ai;
    @BeforeEach
    void setUp() {
        ai = new Intersection();
    }
    @Test
    @Order(1)
    public void testIntersectionHappyPath() {
        int [] input = {1, 2, 4, 5, 89};
        int [] input1 = {8, 9, 4, 2};

        int  [] expectedResult = {2, 4};

        int [] actualResult =ai.IntersectionAlgorithm(input, input1);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testIntersectionHappyPathNegativeNumber() {
        int [] input = {1, 2, 4, 5, 8, 9};
        int [] input1 = {8, 9, 45};

        int  [] expectedResult = {8, 9};

        int [] actualResult =ai.IntersectionAlgorithm(input, input1);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    @Order(3)
    public void testIntersectionHappyPathNo() {
        int [] input = {1, 2, 4, 5, 89};
        int [] input1 = {8, 9, -4, -2};

        int  [] expectedResult = {};

        int [] actualResult =ai.IntersectionAlgorithm(input, input1);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}


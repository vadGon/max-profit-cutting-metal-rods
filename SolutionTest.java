import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void simpleTest1() {
        //Given
        int[] lengths = {26, 59, 103};
        //When
        int res = Solution.maxProfit(1, 10, lengths);
        //Then
        assertEquals(1770, res);

    }

    @org.junit.jupiter.api.Test
    void simpleTest2() {
        //Given
        int[] lengths = {26, 103, 59};
        //When
        int res = Solution.maxProfit(100, 10, lengths);
        //Then
        assertEquals(1230, res);

    }
}
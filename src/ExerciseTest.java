import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseTest {

    @Test
    void sumOfInts_happy() {
        Exercise ex = new Exercise();
        int result= ex.sumOfInts(new int[]{1,2,3,4});
       assertEquals(10,result);
    }

    @Test
    void sumOfInts_emplty() {
        Exercise ex = new Exercise();
        int result= ex.sumOfInts(new int[]{});
        assertEquals(0,result);
    }

    @Test
    void sumOfInts_null() {
        Exercise ex = new Exercise();
        int result= ex.sumOfInts(null);
        assertEquals(0,result);
    }
}
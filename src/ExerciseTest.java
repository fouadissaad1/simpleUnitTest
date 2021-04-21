import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseTest {

    @BeforeAll
     static void setupBeforeAll(){
        System.out.println("setupBeforAll");
    }

    @BeforeEach
    void setupBeforeEach(){
        System.out.println("setupBeforeEach");
    }
    @Test
    void sumOfInts_happy() {
        System.out.println("sumOfInts_happy");
        Exercise ex = new Exercise();
        int result= ex.sumOfInts(new int[]{1,2,3,4});
       assertEquals(10,result);
    }

    @Test
    void sumOfInts_emplty() {
        System.out.println("sumOfInts_emplty");

        Exercise ex = new Exercise();
        int result= ex.sumOfInts(new int[]{});
        assertEquals(0,result);
    }

    @Test
    void sumOfInts_null() {
        System.out.println("sumOfInts_null");
        Exercise ex = new Exercise();
        int result= ex.sumOfInts(null);
        assertEquals(0,result);
    }
}
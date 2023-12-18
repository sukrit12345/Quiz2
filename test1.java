import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class test1
 {

    @Test
    public void testSquarePositive() {
        QuizOneJunit quiz = new QuizOneJunit();
        int result = quiz.square(5);
        assertEquals(25, result);
    }

    @Test
    public void testSquareNegative() {
        QuizOneJunit quiz = new QuizOneJunit();
        int result = quiz.square(-4);
        assertEquals(16, result);
    }

    @Test
    public void testSquareZero() {
        QuizOneJunit quiz = new QuizOneJunit();
        int result = quiz.square(0);
        assertEquals(0, result);
    }
}

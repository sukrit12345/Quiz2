import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class test2 {

    @Test
    public void testCountLetterASingleOccurrence() {
        QuizOneJunit quiz = new QuizOneJunit();
        int result = quiz.countLetterA("apple");
        assertEquals(1, result);
    }

    @Test
    public void testCountLetterAMultipleOccurrences() {
        QuizOneJunit quiz = new QuizOneJunit();
        int result = quiz.countLetterA("banana");
        assertEquals(3, result);
    }

    @Test
    public void testCountLetterANoOccurrences() {
        QuizOneJunit quiz = new QuizOneJunit();
        int result = quiz.countLetterA("grape");
        assertEquals(0, result);
    }

    @Test
    public void testCountLetterAEmptyString() {
        QuizOneJunit quiz = new QuizOneJunit();
        int result = quiz.countLetterA("");
        assertEquals(0, result);
    }
}

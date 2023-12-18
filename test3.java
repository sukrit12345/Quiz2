import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class test3
 {

    @Test
    public void testCheckTwoLetterEqual() {
        QuizOneJunit quiz = new QuizOneJunit();
        boolean result = quiz.checkTwoLetter("abab");
        assertTrue(result);
    }

    @Test
    public void testCheckTwoLetterNotEqual() {
        QuizOneJunit quiz = new QuizOneJunit();
        boolean result = quiz.checkTwoLetter("abcd");
        assertFalse(result);
    }

    @Test
    public void testCheckTwoLetterSingleCharacter() {
        QuizOneJunit quiz = new QuizOneJunit();
        boolean result = quiz.checkTwoLetter("a");
        assertFalse(result);
    }

    @Test
    public void testCheckTwoLetterEmptyString() {
        QuizOneJunit quiz = new QuizOneJunit();
        boolean result = quiz.checkTwoLetter("");
        assertFalse(result);
    }

    @Test
    public void testCheckTwoLetterTwoCharacters() {
        QuizOneJunit quiz = new QuizOneJunit();
        boolean result = quiz.checkTwoLetter("xy");
        assertTrue(result);
    }
}

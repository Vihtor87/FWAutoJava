import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MathServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"-1, 7, 8, 81", "4, 4, 1, 0", "2, 1, 1, -7", "0, 0, 0, 0", "1, 1, 1, -3"})
    void getD_Test(Integer a, Integer b, Integer c, Integer answer){
        MathService mathService = new MathService();
        System.out.println("answer: " + mathService.getD(a, b, c));
        Assertions.assertEquals(answer, mathService.getD(a, b, c));
    }
    @ParameterizedTest
    @CsvSource(value = {"-1, 7, 8, -1.0, 8.0", "4, 4, 1, -0.5, -0.5"})
    void getAnswerTestP(Integer a, Integer b, Integer c, Double answerX1, Double answerX2) throws NotFoundAnswerException {
        MathService mathService = new MathService();
        System.out.println("Answer: "+ answerX1 + "\nAnswer: " + answerX2);
        System.out.println(mathService.getAnswer(a, b, c));
        Pair pair = new Pair(answerX1, answerX2);
        Assertions.assertEquals(String.valueOf(pair), String.valueOf(mathService.getAnswer(a,b,c)));
    }
    @ParameterizedTest
    @CsvSource(value = {"2, 1, 1, Корни не могут быть найдены", "1, 1, 1, Корни не могут быть найдены"})
    void getAnswerTestN(Integer a, Integer b, Integer c, String answer){
        MathService mathService = new MathService();
        Throwable exception = Assertions.assertThrows(
                NotFoundAnswerException.class,
                () -> {
                    throw new NotFoundAnswerException(String.valueOf(mathService.getAnswer(a,b,c)));
                }
        );
        Assertions.assertEquals(answer, exception.getMessage());
    }
    @Test
    void getAnswerTestByZeroN(){
        int a = 0;
        int b = 0;
        int c = 0;
        String answer = "/ by zero";
        MathService mathService = new MathService();
        Throwable exception = Assertions.assertThrows(
                ArithmeticException.class,
                () -> {
                    throw new NotFoundAnswerException(String.valueOf(mathService.getAnswer(a,b,c)));
                }
        );
        Assertions.assertEquals(answer, exception.getMessage());
    }
}
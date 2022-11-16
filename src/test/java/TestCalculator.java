import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    Calculator calc = new Calculator();

    @Test
    void summation(){
        assertEquals(2,calc.sum(1,1));
    }

    @Test
    void multiplication(){
        assertEquals(1,calc.mul(1,1));
    }

    @Test
    void subtraction(){
        assertEquals(0,calc.sub(1,1));
    }

    @Test
    void division(){
        assertEquals(1,calc.div(1,1));
    }
}

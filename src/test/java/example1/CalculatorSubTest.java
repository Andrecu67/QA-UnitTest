package example1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class CalculatorSubTest {
    Calculator calculator;

    @BeforeEach
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void  verifySubtractionPar() throws Exception{
        int actualResult = calculator.sub(4,2);
        int expectedResult = 2;
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la resta es incorrecta");
    }

    @Test
    @Timeout(value = 2)
    public void  verifySubtractionTimePar() throws Exception{
        int actualResult = calculator.sub(4,2);
        int expectedResult = 2;
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la resta es incorrecta");
    }
}

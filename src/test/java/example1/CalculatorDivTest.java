package example1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorDivTest {
    Calculator calculator;

    @BeforeEach
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void  verifyDivisionPar() throws Exception{
        int actualResult = calculator.sub(4, 2);
        int expectedResult = 2;
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la division es incorrecta");
    }

    //Verificacion Negativa, para que el codigó mande excepciones se utiliza los throws y assertThrows
    @Test
    public void  verifyDivisionImpar() throws Exception{
        Assertions.assertThrows(Exception.class,()-> {
            calculator.sub(4,0);
        });
    }
}

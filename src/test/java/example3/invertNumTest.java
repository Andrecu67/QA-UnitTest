package example3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class invertNumTest {
    @ParameterizedTest
    @CsvSource(
            {
                    "-1,Valor Incorrecto",
                    "0, 0",
                    "123, 321",
                    "100, 001",
                    "8, 8",
                    "80, 08"
            }
    )
    public void  verifyGetMessage(int Value, String expectedResult){
        invertNum invert = new invertNum();
        String actualResult = invert.invertir(Value);
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! La inversion es incorrecta");
    }

}

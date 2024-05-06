package exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class IsPalindromeTest {
    IsPalindrome palindrome;

    @BeforeEach
    public void setup(){
        palindrome = new IsPalindrome();
    }

    @ParameterizedTest
    @CsvSource(
            {
                    "reconocer,true",
                    "ana,true",
                    "oso,true",
                    "radar,true",
            }
    )
    public void testPalindromo(String palabraIn, boolean expectedVerify) {
        // Casos de prueba con palabras que son palíndromos
        boolean actualVerify = palindrome.esPalindromo(palabraIn);
        Assertions.assertEquals(expectedVerify,actualVerify,"ERROR! La verificación es incorreta");
    }

    @ParameterizedTest
    @CsvSource(
            {
                    "java,false",
                    "progamacion,false",
                    "openai,false",
                    "hola,false",
            }
    )
    public void testNoPalindromo(String palabraIn, boolean expectedVerify) {
        // Casos de prueba con palabras que son palíndromos
        boolean actualVerify = palindrome.esPalindromo(palabraIn);
        Assertions.assertEquals(expectedVerify,actualVerify,"ERROR! La verificación es incorreta");
    }
}

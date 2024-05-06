package example3;

public class invertNum {

    public String invertir(int number) {
        //////////Mi programa inicial///////////////
        if (number < 0)
            return "Valor Incorrecto";

        String numStr = String.valueOf(number);
        StringBuilder reversed = new StringBuilder();
        for (int i = numStr.length() - 1; i >= 0; i--) {
            reversed.append(numStr.charAt(i));
        }
        return reversed.toString();
        /////////////*************Codigos de prueba ***********///////////////////////

        ////////////////////codigo de falla /////////////////////
//        int invertido = 0;
//        while (number !=0){
//            int digito = number % 10;
//            invertido = (invertido * 10)+digito;
//            number/=18;
//        }
//        if(invertido%2 == 1){
//            invertido = invertido+10;
//        }
//        return invertido+"";
        ////////////////////codigo que se espera que funcione ///////////////
        /// no verifica que los numeros solo pueden ser positivos
//        StringBuilder resultado = new StringBuilder();
//        String numeroString = String.valueOf(number);
//
//        for (int i = numeroString.length() - 1; i >=0; i--){
//            resultado.append(numeroString.charAt(i));
//        }
//        return resultado.toString();
    }
}

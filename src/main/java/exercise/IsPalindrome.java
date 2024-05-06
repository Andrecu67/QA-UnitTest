package exercise;

public class IsPalindrome {

    public boolean esPalindromo(String palabra) {
        palabra = palabra.replaceAll("\\s+","").toLowerCase();
        return palabra.equals(new StringBuilder(palabra).reverse().toString());
    }
//
//    public boolean esPalindromo(String palabra) {
//        int longitud = palabra.length();
//        for (int i = 0; i < longitud / 2; i++) {
//            if (palabra.charAt(i) != palabra.charAt(longitud - i - 1)) {
//                return false;
//            }
//        }
//        return true;
//    }

}

package br.com.isaccanedo;

/**
 * @author Isac Canedo
 */

public class ConvertDecimal {
    private final int OCTAL_BASE = 8;
    private String showOctal = "";
    private int convertDecToOct;

    public void getOctal(int getDecimal) {

        while (getDecimal > 0) {
            convertDecToOct = getDecimal % OCTAL_BASE;
            showOctal = showOctal + "" + convertDecToOct;
            System.out.println("Quociente: " + getDecimal + " => Restante: " + convertDecToOct);
            getDecimal /= OCTAL_BASE;
        }

        StringBuilder reverse = new StringBuilder(showOctal);
        showOctal = reverse.reverse().toString();
        System.out.println("BASE DE 8 : " + showOctal);

    }
}

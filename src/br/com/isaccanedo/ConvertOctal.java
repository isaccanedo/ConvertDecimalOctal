package br.com.isaccanedo;

/**
 * @author Isac Canedo
 */

public class ConvertOctal {

    private final int OCTAL_BASE = 8;
    private int showDecimal = 0;
    private int convertOctToDec;
    private String x = "";

    public void getDecimal(int getOctal) {

        x = String.valueOf(getOctal);

        StringBuilder reverse = new StringBuilder(x);

        x = reverse.reverse().toString();
        char[] dec = x.toCharArray();

        for (int i = 0; i < dec.length; i++) {
            convertOctToDec = (int) dec[i] - '0';
            convertOctToDec = convertOctToDec * (int) Math.pow(OCTAL_BASE, i);
            showDecimal += convertOctToDec;
            System.out.println(dec[i] + " x " + OCTAL_BASE + " aumentar para " + i + " = " + convertOctToDec);
        }

        System.out.println("BASE DE 10 : " + showDecimal);

    }
}

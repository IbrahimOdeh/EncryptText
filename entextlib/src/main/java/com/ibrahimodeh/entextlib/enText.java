package com.ibrahimodeh.entextlib;

public class enText {

    private static String getTheText(String text)
    {
        switch (text) {
            case "1":
                return "A";
            case "2":
                return "B";
            case "3":
                return "C";
            case "4":
                return "D";
            case "5":
                return "E";
            case "6":
                return "F";
            case "7":
                return "G";
            case "8":
                return "H";
            case "9":
                return "I";
            case "10":
                return "J";
            case "11":
                return "K";
            case "12":
                return "L";
            case "13":
                return "M";
            case "14":
                return "N";
            case "15":
                return "O";
            case "16":
                return "P";
            case "17":
                return "Q";
            case "18":
                return "R";
            case "19":
                return "S";
            case "20":
                return "T";
            case "21":
                return "U";
            case "22":
                return "V";
            case "23":
                return "W";
            case "24":
                return "X";
            case "25":
                return "Y";
            case "26":
                return "Z";
            case "0":
                return " ";
            default:
                return text;
        }
    }

    private static String getTheNumber(String text)
    {
        switch (text.toUpperCase()) {
            case "A":
                return "-1";
            case "B":
                return "-2";
            case "C":
                return "-3";
            case "D":
                return "-4";
            case "E":
                return "-5";
            case "F":
                return "-6";
            case "G":
                return "-7";
            case "H":
                return "-8";
            case "I":
                return "-9";
            case "J":
                return "-10";
            case "K":
                return "-11";
            case "L":
                return "-12";
            case "M":
                return "-13";
            case "N":
                return "-14";
            case "O":
                return "-15";
            case "P":
                return "-16";
            case "Q":
                return "-17";
            case "R":
                return "-18";
            case "S":
                return "-19";
            case "T":
                return "-20";
            case "U":
                return "-21";
            case "V":
                return "-22";
            case "W":
                return "-23";
            case "X":
                return "-24";
            case "Y":
                return "-25";
            case "Z":
                return "-26";
            case "0":
                return " ";
            default:
                return text;
        }
    }

    // Encrypt the text
    public static String encText(String text)
    {
        StringBuilder encryptedText = new StringBuilder();

        String[] textArray = text.split("-");
        for (String s : textArray) {
            encryptedText.append(getTheText(s));
        }

        return encryptedText.toString();
    }

    // Decrypt the text
    public static String decText(String text)
    {
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            decryptedText.append(getTheNumber(String.valueOf(c)));
        }

        return decryptedText.toString();
    }
}


public class Prog1 {

    public static void main(String[] args) {
        for (String arg : args) {
            DefinitionOfNumber(arg);
        }
    }

    static void DefinitionOfNumber(String a) {
        int LengthOfA;
        LengthOfA = getString(a).length();
        String DefOfA;
        String PositiveNegative;
        if (LengthOfA == 1) {
            DefOfA = "однозначное";
        } else if (LengthOfA == 2) {
            DefOfA = "двухзначное";
        } else {
            DefOfA = "трёхзначное и более";
        }
        if (Integer.parseInt(a) < 0) {
            PositiveNegative = " отрицательное";
        } else {
            PositiveNegative = " положительное";
        }
        System.out.println(DefOfA + PositiveNegative + " число");


    }

    private static String getString(String a) {
        return Integer.toString(Math.abs(Integer.parseInt(a)));
    }


}

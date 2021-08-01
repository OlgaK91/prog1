
public class Prog7 {

    public static void main(String[] args) {
        for (String arg : args) {
            DefinitionOfNumber(arg);
        }
    }

    static void DefinitionOfNumber(String a) {
        String LastChar = Character.toString(a.charAt(a.length() - 1));
        String b;
        if (LastChar.equals("1")) {
            b = "";
        } else if (LastChar.equals("2") || LastChar.equals("3") || LastChar.equals("4")) {
            b = "а";
        } else {
            b = "oв";
        }

        System.out.println(a + " программист" + b);


    }


}

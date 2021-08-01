
public class prog4 {

    public static void main(String[] args) {

        int positive_count = 0;

        for (String arg : args) {
            if (Integer.parseInt(arg) > 0) {
                positive_count++;
            }
        }
        System.out.println((positive_count) + " положительных");

    }


}


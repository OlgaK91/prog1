
public class Prog5 {

    public static void main(String[] args) {

        int total_count = args.length;
        int negative_count = 0;

        for (String arg : args) {
            if (Integer.parseInt(arg) < 0) {
                negative_count++;
            }
        }
        System.out.println(negative_count + " отрицательных, " + (total_count - negative_count) + " положительных");

    }


}

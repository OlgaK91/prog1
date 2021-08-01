
public class prog3 {

    public static void main(String[] args) {

        for (String arg : args) {
            int a = Integer.parseInt(arg);
            if (a > 0) {
                a++;
                System.out.println(a);
            } else if (a < 0) {
                a += 2;
                System.out.println(a);
            } else {
                System.out.println(10);
            }
        }

    }


}


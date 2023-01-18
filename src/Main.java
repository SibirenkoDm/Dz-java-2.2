public class Main {
    public static void main(String[] args) {
        int y = 100;
        int a = 1200;
        int c = (a / 100);
        if (a < 1000) {
            int b = (y + a);
            System.out.println(b);
        }
        if (a >= 1000) {
            int b = (y + a + c);
            
            System.out.println(b);
            System.out.println(c);
        }


    }
}
package TwoByFirst;

public class RunMain {
    public static void main(String[] args) {
        String s1 = "4251-ABS-1367-ABS-0T1G";
        String start = "555";


        try {
            RunRun.process(s1,start);
            System.out.println("OK");
        } catch (S2Exception e) {
            System.out.println("Документ не начинается с цифр: "+start);
            System.out.println(e.getMessage());

        }
    }
}
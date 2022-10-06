package End;

import TwoByFirst.RunRun;
import TwoByFirst.S2Exception;

public class MainEnd {
    public static void main(String[] args) {
        String s1 = "4251-ABS-1367-ABS-0T1G";
        String end = "1a2b";


        try {
            RunEnd.process(s1,end);
            System.out.println("OK");
        } catch (S2Exception e) {
            System.out.println("Документ не заканчивается символами: "+end);
            System.out.println(e.getMessage());

        }
    }
}

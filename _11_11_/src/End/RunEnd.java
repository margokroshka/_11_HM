package End;

import TwoByFirst.S2Exception;

public class RunEnd {
    public static void  process(String s1, String end) throws S2Exception {
        if(!s1.toLowerCase().contains(end.toLowerCase())) {
            String message = "\nconfirm invalid\nодна ошибка и ты ошибся";

            throw new S2Exception(message);
        }
    }
}

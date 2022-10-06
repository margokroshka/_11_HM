package TwoByFirst;

public class RunRun {
    public static void  process(String s1, String start) throws S2Exception {
        if(!s1.toLowerCase().contains(start.toLowerCase())) {
            String message = "\nconfirm invalid\nодна ошибка и ты ошибся";

            throw new S2Exception(message);
        }
    }
}

public class Run {

        public static void  process(String s1, String sub) throws S1Exception {
            if(!s1.toLowerCase().contains(sub.toLowerCase())) {
                String message = "\nconfirm invalid\nодна ошибка и ты ошибся";

                throw new S1Exception(message);
            }
    }
}

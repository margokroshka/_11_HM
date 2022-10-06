public class Main2 {
    public static void main(String[] args) {
        String s1="4251-ABS-1367-ABS-0T1G";
        System.out.println();
        String sub="abc";

        try {
            Run.process(s1,sub);
            System.out.println("OK");
        } catch (S1Exception e) {
            System.out.println("Trouble, trouble, trouble\n" + "Oh, oh\n"+"by T.S.");  //Пароль не верный
            System.out.println(e.getMessage());

        }

    }
}

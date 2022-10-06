public class Main {
    public static void main(String[] args) {
        String s1="4251-ABS-1367-ABS-0T1G";
        String substr1=s1.substring(0,4);
        String substr2=s1.substring(9,13);
        System.out.println(substr1+" "+substr2);


        String replace=s1.replaceAll("[A-za-z]{3}", "***");
        System.out.println(replace);

        String[] split=s1.split("4251-");
        for (String sF:split
        ) {
            String[] split1=sF.split("-1367-");
            for (String sF1:split1
            ) {

                String[] split2=sF1.split("-0");
                for (String sF2:split2
                ) {

                    String[] split3=sF2.split("1");
                    for (String sF3:split3
                    ) {
                        System.out.print(sF3.trim().toLowerCase()+"/");

                    }
                }
            }
        }
        System.out.println();
        System.out.print("Letters: ");
        String[] split0=s1.split("4251-");
        for (String sF:split0
        ) {

            String[] split1=sF.split("-1367-");
            for (String sF1:split1
            ) {

                String[] split2=sF1.split("-0");
                for (String sF2:split2
                ) {


                    String[] split3=sF2.split("1");
                    for (String sF3:split3
                    ) {

                        System.out.print(sF3.trim());
                        System.out.print("/");
                    }
                }
            }
        }
        System.out.println();
        String sub=" ";
        System.out.println(s1.toLowerCase().contains(sub.toLowerCase()));

        String start="555";
        System.out.println(s1.startsWith(start));
//
//        String end="1a2b";
//        System.out.println(s1.endsWith(end));
    }
    }

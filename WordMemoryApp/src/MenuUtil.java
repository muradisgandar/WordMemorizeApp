

import java.util.Scanner;

public class MenuUtil {
    public static void menuUtil(int choose) throws Exception {
        Scanner sc = new Scanner(System.in);

            if (choose == 1) {
                System.out.println("Sual hansı dildə soruşulsun?\n" +
                        "(is question asked for in which language?)\n" +
                        " Zəhmət olmasa daxil edin. \n" +
                        "(Please enter)\n" +
                        "1 - İngilis dili ,\n" +
                        "(1-in English)\n" +
                        " 2- Azərbaycan dili\n" +
                        "(2- in Azerbaijani)\n");
                int seçim = sc.nextInt();

                if (seçim == 1) {
                    QuizUtil.ingiliscə();
                } else if (seçim == 2) {
                    QuizUtil.azərbaycanca();
                }
            } else if (choose == 2) {
                System.out.println("Please enter word in English(Zəhmət olmasa sözü ingiliscə daxil edin)");
                String enWord = sc.nextLine();
                System.out.println("Please enter word in Azerbaijani(Zəhmət olmasa sözü azərbaycanca daxil edin)");
                String azWord = sc.nextLine();

                Database.insert(new Words(enWord, azWord));

                System.out.println("Words are added into database");
            }
            else if(choose==3){
                System.exit(0);
            }



    }




}

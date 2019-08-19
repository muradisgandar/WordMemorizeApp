import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class QuizUtil {


    public static void ingiliscə() throws Exception {
        Scanner sc = new Scanner(System.in);

        HashMap<String,String> map = Database.getAllDataWithKeyEng();


        for (String key: map.keySet()) {
            System.out.println("How is it translated? "+key);
            String value = sc.nextLine();

            boolean checking = Checking.checkingForKeyEng(key,value,map);
            if(checking){
                System.out.println("You know correctly!");
            }
            else{
                System.out.println("You don't know , Correct answer is "+map.get(key));

            }


        }

    }

    public static void azərbaycanca() throws Exception {
        Scanner sc = new Scanner(System.in);

        HashMap<String,String> map = Database.getAllDataWithKeyAz();


        for (String key: map.keySet()) {
            System.out.println("Tərcüməsi nədir? "+key);
            String value = sc.nextLine();

            boolean checking = Checking.checkingForKeyAz(key,value,map);
            if(checking){
                System.out.println("Düzgün bildiniz!");
            }
            else{
                System.out.println("Bilmədiniz, Düzgün cavab "+map.get(key)+" dır");

            }


        }

    }





}

import java.util.HashMap;
import java.util.Scanner;

public class Checking {


    public static boolean checkingForKeyEng(String key,String value, HashMap<String,String > map){
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        for(int i=0;i<2;i++) {

            if(value.equals(map.get(key))){
                return true;
            }
            else {
                bool = false;
                System.out.println("Wrong answer! ,Try again!");
                value = sc.nextLine();
            }

        }
        return false;
    }

    public static boolean checkingForKeyAz(String key,String value, HashMap<String,String > map){
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        for(int i=0;i<2;i++) {

            if(value.equals(map.get(key))){
                return true;
            }
            else {
                bool = false;
                System.out.println("Səhv cavab! ,Yenidən cəhd edin!");
                value = sc.nextLine();
            }

        }
        return false;
    }

}
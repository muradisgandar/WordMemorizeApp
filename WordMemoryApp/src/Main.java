import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Which operation do you want to do ?\n " +
                    "(Hansı əməliyyatı istəyirsiniz ?)\n"+
                    "1.Quiz(Az-Eng or Eng-Az  \n" +
                    "(1.Sorğu- Sual)\n"+
                    "2.Insert some words to database\n"+
                    "(2.Bazaya əlavə edin)\n"+
                    "3.Exit\n"+
                    "(3.Çıxış)\n");
            int operation = sc.nextInt();
            if(operation==1){
                MenuUtil.menuUtil(operation);
            }
            else if(operation==2){
                MenuUtil.menuUtil(operation);
            }
            else if(operation==3){
                MenuUtil.menuUtil(operation);
            }
        }







    }
}

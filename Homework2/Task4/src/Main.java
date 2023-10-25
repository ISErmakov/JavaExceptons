import java.util.Scanner;

/**Разработайте программу, которая выбросит Exception,
 * когда пользователь вводит пустую строку. Пользователю должно показаться сообщение,
 * что пустые строки вводить нельзя.
 *
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(getString());
        } catch (Exception e) {
            System.out.println(e);
            main(null);
        }
    }
    private static float getFloat(){
        System.out.println("Enter float");
        Scanner sc = new Scanner(System.in);
        float res = 0;
        try{
            res = sc.nextFloat();
        } catch (Exception e){
            e.printStackTrace();
            return getFloat();
        }
        return res;
    }

    private static String getString() throws Exception{
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String res = "";
        res = sc.nextLine();
        if (res.isEmpty()) {throw new RuntimeException("Empty String");}
        return res;
    }
}
package View;

import java.util.Scanner;

public class View implements iGetView{

    @Override
    public String promt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }

    @Override
    public void message(String s) {
        System.out.println(s);
    }
}

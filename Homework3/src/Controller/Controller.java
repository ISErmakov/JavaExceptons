package Controller;

import Model.Human;
import View.iGetView;

import java.io.IOException;

public class Controller implements iController{
    private iGetView view;
    private iLoggable logger;
    public Controller(iGetView view, iLoggable logger){
        this.logger = logger;
        this.view = view;
    }
    @Override
    public void run() throws IOException{
        String s;
        while (!(s = view.promt("Введите данные или команду EXIT")).equals("EXIT")){
            Human human = new Human();
            try {
                human.parseHuman(s);
                human.safeFile();
            } catch (IOException | RuntimeException e) {
                e.printStackTrace();
                logger.log(e.getMessage());
            }
        }
        view.message("Program finished");
    }
}

package Controller;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogControl implements iLoggable{
    @Override
    public void log(String message) throws IOException {
        FileHandler fh = new FileHandler("LogControl.log", true);
        Logger logger = Logger.getLogger(Controller.class.getName());
        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);
        logger.log(Level.INFO, message);
    }
}

package implementation;

import java.util.Date;

public class Logger implements ILogger {

    public void log(String message) {

        System.out.println( new Date() + " : "+ message );
    }

}

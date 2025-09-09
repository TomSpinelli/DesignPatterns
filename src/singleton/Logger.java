package singleton;

import java.util.ArrayList;
import java.util.List;

public class Logger {

    private static Logger instance;
    private List<String> logs;

    private Logger(){
        logs = new ArrayList<>();
    }
    public static Logger getInstance(){

        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void addlog(String log){
        logs.add(log);
        System.out.println("Log added - " + log);
    }

    public void clearLog(){
        logs.clear();
    }

    public void getLogs(){
        for(String log : logs){
            System.out.println(log);
        }
    }
}

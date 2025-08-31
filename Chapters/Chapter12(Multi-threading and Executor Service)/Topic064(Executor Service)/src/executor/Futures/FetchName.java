package executor.Futures;

import java.util.concurrent.Callable;

public class FetchName implements Callable{
    private final String name;
    FetchName(String name){
        this.name = name;
    }
    @Override
    public Object call() throws Exception {
        System.out.printf("\nGetting Full Name of %s from server",name);
        Thread.sleep(4000);
        return name + " Bharatiya";
    }
}

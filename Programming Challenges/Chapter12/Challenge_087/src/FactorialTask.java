import java.util.concurrent.Callable;

public class FactorialTask implements Callable{
    private final int num;
    FactorialTask(int num){
        this.num = num;
    }
    @Override
    public Object call() throws Exception {
        Integer result = 1;
        for(int i = 2; i <= num; i++){
            result *= i;
        }
        return result;
    }
}

package threads;

public class TarefaPesadaPi implements Runnable{
    @Override
    public void run() {
        System.out.println( PiCalculator.calc(100000000) );
    }
}
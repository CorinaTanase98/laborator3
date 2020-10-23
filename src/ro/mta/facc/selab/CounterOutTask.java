package ro.mta.facc.selab;

public class CounterOutTask implements Task {

    int counter=0;
    @Override
    public void execute() {
    while (this.counter!=-1)
    {
        System.out.println(this.counter++);
    }
    }
}

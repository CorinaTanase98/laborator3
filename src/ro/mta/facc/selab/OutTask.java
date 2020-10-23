package ro.mta.facc.selab;

public class OutTask  implements Task {

    String mes;

    @Override
    public void execute() {
        System.out.println(this.mes);
    }

    public OutTask(String mes) {
        this.mes = mes;
    }
}

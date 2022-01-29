public class ContaPoupanca extends Conta {

    private static final String TIPO_CONTA = "Poupanca";

    public ContaPoupanca(Cliente cli) {
        super(cli);
    }

    @Override
    protected void imprimirInfos() {
        System.out.println("------- Conta Poupanca -------");
        super.imprimirInfos();
    }

    @Override
    protected String tipoConta() {
        return TIPO_CONTA;
    }
}

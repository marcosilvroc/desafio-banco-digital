public class ContaCorrente extends Conta{

    private static final String TIPO_CONTA = "Corrente";

    public ContaCorrente(Cliente cli) {
        super(cli);
    }

    @Override
    protected void imprimirInfos() {
        System.out.println("------- Conta Corrente -------");
        super.imprimirInfos();
    }

    @Override
    protected String tipoConta() {
        return TIPO_CONTA;
    }
}

public abstract class Conta {

    private static final int AGENCIA_PADRAO = 101;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cli){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cli;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(double valor, Conta cDestino){
        this.sacar(valor);
        cDestino.depositar(valor);
    }

    protected void imprimirInfoSimples(){ // Exibe dados do cliente e dados da conta ao banco
        this.cliente.imprimirDados();
        System.out.println("-------- Dados Conta --------");
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Conta: " + getNumero());
        System.out.println("Tipo de Conta: Conta " + tipoConta());
        System.out.println("-----------------------------\n");
    }

    protected void imprimirInfos(){ // Exibe todos os dados da conta
        System.out.println("Cliente: " + getCliente().getNome());
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Conta: " + getNumero());
        System.out.printf("Saldo: %.2f \n", getSaldo());
        System.out.println("-----------------------------\n");
    }

    protected void exibirSaldo(){ // Exibe o saldo atual da conta
        System.out.println("-------- Saldo em Conta --------");
        System.out.println("Conta: " + getNumero());
        System.out.printf("Saldo: %.2f \n", getSaldo());
        System.out.println("--------------------------------\n");
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    protected String tipoConta(){
        return("null");
    }
}

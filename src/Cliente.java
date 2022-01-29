public class Cliente  {

    private String nome;
    private String CPF;

    public Cliente(String nome, String cpf){
        setCPF(cpf);
        if(!cpf.isEmpty()) setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    private void setCPF(String cpf) {
        if(cpf.length() == 11) this.CPF = cpf;
        else System.out.println("Numero de CPF invalido");
    }

    protected void imprimirDados(){
        System.out.println("-------- Dados Cliente --------");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCPF());
    }

    protected boolean isCPFEmpty(){
        if(getCPF().isBlank()) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'';
    }
}

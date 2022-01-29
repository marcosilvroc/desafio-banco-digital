import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome){
        this.nome = nome;
        contas = new ArrayList<Conta>();
    }

    protected void listaContas(){ // Exibe todas as contas
        for(Conta c : contas) c.imprimirInfoSimples();
    }

    protected void abrirConta(String nome, String cpf, char tipoConta){ // Cria uma nova conta no banco
        Cliente novo;

        switch (tipoConta){
            case 'C': //conta corrente
                novo = new Cliente(nome, cpf);
                if(!novo.isCPFEmpty()) contas.add(new ContaCorrente(novo));
                else System.out.println("Erro ao criar conta.");
                break;

            case 'P': //conta poupanca
                novo = new Cliente(nome, cpf);
                if(!novo.isCPFEmpty()) contas.add(new ContaPoupanca(novo));
                else System.out.println("Erro ao criar conta.");
                break;
        }
    }

    protected void fecharConta(String cpf, char tipoConta){ // Remove uma conta existente do banco

        switch (tipoConta){
            case 'C': //conta corrente
                for(Iterator<Conta> iterator = contas.iterator(); iterator.hasNext();){
                    Conta c = iterator.next();
                    if(c.cliente.getCPF().equals(cpf) && c.tipoConta().equals("Corrente")) iterator.remove();
                }
                break;

            case 'P': //conta poupanca
                for(Iterator<Conta> iterator = contas.iterator(); iterator.hasNext();){
                    Conta c = iterator.next();
                    if(c.getCliente().getCPF().equals(cpf) && c.tipoConta().equals("Poupanca")) iterator.remove();
                }
                break;
        }
    }

    protected Conta acessarConta(String cpf, char tipoConta){ // Obtem acesso a uma conta do banco usando o CPF do cliente
        switch (tipoConta){
            case 'C': //conta corrente
                for(Conta c : contas){
                    if(c.cliente.getCPF().equals(cpf) && c.tipoConta().equals("Corrente")) return c;
                }
                break;

            case 'P': //conta poupanca
                for(Conta c : contas){
                    if(c.cliente.getCPF().equals(cpf) && c.tipoConta().equals("Poupanca")) return  c;
                }
                break;
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    private List<Conta> getContas() {
        return contas;
    }
}

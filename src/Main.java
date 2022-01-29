public class Main {

    public static void main(String[] args) {
        Banco bancodigital = new Banco("Banco Digital");

        bancodigital.abrirConta("Jose", "11111111111", 'C');
        bancodigital.abrirConta("Maria", "11111111122", 'C');
        bancodigital.abrirConta("Joaquim", "11111111133", 'P');

        bancodigital.listaContas();

        bancodigital.acessarConta("11111111122", 'C').depositar(1250.00);
        bancodigital.acessarConta("11111111122", 'C').exibirSaldo();
        //Conta contajose = bancodigital.acessarConta("11111111111", 'C');
        bancodigital.acessarConta("11111111122", 'C').transferir(250.50, bancodigital.acessarConta("11111111111", 'C'));
        bancodigital.acessarConta("11111111122", 'C').imprimirInfos();
        bancodigital.acessarConta("11111111111", 'C').imprimirInfos();
        bancodigital.fecharConta("11111111133", 'P');

        bancodigital.listaContas();
    }
}

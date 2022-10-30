package Servico;

        import domain.Funcionario;
        import domain.documento.Documento;

        import java.util.Scanner;

public class Servico {
    public void criarDocumentoTela(Funcionario usuario, String nome){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        Documento documento = new Documento(nome);
        usuario.adicionarDocumento(documento);
    }

    public void enviarAprovacao(Funcionario usuario) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o identificador do Aprovador(Supervisor):");
        Integer idAprovador = scanner.nextInt();
        System.out.print("Qual é o identificador do Documento:");
        Integer idDocumento = scanner.nextInt();

        usuario.pedirAprovacaoDocumento(idAprovador, idDocumento);
    }


}

import domain.Funcionario;
import Repositorio.ListaSupervisor;
import Repositorio.ListaPessoa;
import Servico.Servico;
import domain.Supervisor;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    private static String nome;

    public static void main(String[] args) {


        Supervisor supervisor = new Supervisor(
                "Jose Santos",
                LocalDate.of(2010,10,11),
                "av das Palmeiras, 11"
        );


        Servico servico = new Servico();

        Scanner scannerNavegacao = new Scanner(System.in);

        boolean executa = true;
        while(executa){
            System.out.print("Qual o seu id: ");
            Integer id = scannerNavegacao.nextInt();

            Supervisor usuario = ListaSupervisor.retornar(id);
            System.out.println();

            System.out.print("Qual operacao você deseja realizar: " +
                    "\n 1 - Criar Documento" +
                    "\n 2 - Pedir Aprovação do Documento" +
                    "\n Entre a opção escolhida:");

            Integer operacao = scannerNavegacao.nextInt();

            switch (operacao){
                case 1:
                    servico.criarDocumentoTela(usuario, nome);
                    break;
                case 2:
                    servico.enviarAprovacao(usuario);
                    break;
            }


            System.out.print("Deseja Encerrar? " +
                    "\n 1 - Sim" +
                    "\n 2 - Não" +
                    "\n Entre a opção escolhida:");

            Integer encerrar = scannerNavegacao.nextInt();

            switch (encerrar){
                case 1:
                    executa = false;
                    break;
                case 2:
                    executa = true;
                    break;
            }
        }
        System.out.printf(ListaPessoa.retornarTodos().toString());
    }
}
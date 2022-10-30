package domain;

import Repositorio.ListaSupervisor;
import domain.documento.Documento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Supervisor extends Funcionario {
    private static Integer contador = 0;
    private static final List<Documento> documentosAprovados = new ArrayList<>();
    private static final List<Documento> documentosRecusados = new ArrayList<>();

    public Supervisor(String nome, LocalDate dataNascimento, String endereço) {
        super(contador++, nome, dataNascimento, endereço);
        ListaSupervisor.adicionar(this);
    }

    @Override
    public void adicionarDocumento(Documento documento) {
        documentosAprovados.add(documento);
        System.out.println("Documento Aprovado");
        System.out.println(documento);
        System.out.println(documentosRecusados);
    }

    ;
    public void aprovarDocumento(Long idDocumentosAprovados) {
        System.out.println("Documento Aprovado pelo Supervisor, nome: " + this.getNome());

        for (Documento documento : documentosAprovados) {
            if (Objects.equals(documento.getIdentificador(), idDocumentosAprovados)) {
                documentosRecusados.remove(documento);
                documento.setNome("nome2");
                documentosAprovados.add(documento);
            }
        }

    }

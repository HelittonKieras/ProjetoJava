package domain;

import Repositorio.ListaPessoa;
import domain.documento.Documento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {
    private List<Documento> documentos = new ArrayList<>();

    public Funcionario(Integer identificador, String nome, LocalDate dataNascimento, String endereco) {
        super(identificador, nome, dataNascimento, endereco);
        ListaPessoa.adicionar(this);

    }

    public void adicionarDocumento(Documento documento) {
        documentos.add(documento);
        System.out.println("Documento Adicionado");
    }

    public void pedirAprovacaoDocumento(Integer idAprovador, Integer idDocumento) {
        return;
    }
}
package domain.documento;

import java.util.random.RandomGenerator;

public class Documento {
    private Long identificador;
    private String nome;

    public Documento(String nome) {
        this.nome = nome;
        this.identificador = RandomGenerator.getDefault().nextLong();
    }

    @Override
    public String toString() {
        return "Documento{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Long identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
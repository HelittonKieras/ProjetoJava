package domain;

import java.time.LocalDate;

public class Pessoa {
    private Integer identificador;
    private String nome;
    private String sobrenome;
    private String endereco;
    private LocalDate dataNascimento;

    public Pessoa(Integer identificador,
                  String nome,
                  LocalDate dataNascimento,
                  String endereço) {
        this.identificador = identificador;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereço;
        this.sobrenome = sobrenome;
    }

    public Pessoa() {
    }


    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome() {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "identificador=" + identificador +
                ", nome='" + nome + '\'' +
                ", endereço='" + endereco + '\'' +
                ", dataNascimento=" + dataNascimento;
    }
}
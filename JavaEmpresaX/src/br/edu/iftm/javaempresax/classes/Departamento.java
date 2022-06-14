package br.edu.iftm.javaempresax.classes;

import java.util.Date;

public class Departamento {

    private int codigo;
    private String nome;
    private int codGerente;
    private Date dataGerente;

    public Departamento() {
    }

    public Departamento(int codigo, String nome, int codGerente, Date dataGerente) {
        this.codigo = codigo;
        this.nome = nome;
        this.codGerente = codGerente;
        this.dataGerente = dataGerente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodGerente() {
        return codGerente;
    }

    public void setCodGerente(int codGerente) {
        this.codGerente = codGerente;
    }

    public Date getDataGerente() {
        return dataGerente;
    }

    public void setDataGerente(Date dataGerente) {
        this.dataGerente = dataGerente;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", codGerente=" + codGerente +
                ", dataGerente=" + dataGerente +
                '}';
    }
}

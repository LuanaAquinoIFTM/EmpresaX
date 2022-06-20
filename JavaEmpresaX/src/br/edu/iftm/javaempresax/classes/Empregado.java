package br.edu.iftm.javaempresax.classes;

import java.util.Date;

public class Empregado {

    private int codigo;
    private String nome;
    private Date datanasc;
    private String endereco;
    private char sexo;
    private double salario;
    private int codSuperv;
    private int codDepto;
    private Departamento departamento;


    public Empregado(int codigo, String nome, Date datanasc,
                     String endereco, char sexo, double salario,
                     int codSuperv, int codDepto, Departamento departamento) {
        this.codigo = codigo;
        this.nome = nome;
        this.datanasc = datanasc;
        this.endereco = endereco;
        this.sexo = sexo;
        this.salario = salario;
        this.codSuperv = codSuperv;
        this.codDepto = codDepto;
        this.departamento = departamento;
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

    public Date getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(Date datanasc) {
        this.datanasc = datanasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCodSuperv() {
        return codSuperv;
    }

    public void setCodSuperv(int codSuperv) {
        this.codSuperv = codSuperv;
    }

    public int getCodDepto() {
        return codDepto;
    }

    public void setCodDepto(int codDepto) {
        this.codDepto = codDepto;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", datanasc=" + datanasc +
                ", endereco='" + endereco + '\'' +
                ", sexo=" + sexo +
                ", salario=" + salario +
                ", codSuperv=" + codSuperv +
                ", codDepto=" + codDepto +
                ", departamento=" + departamento +
                '}';
    }
}

package br.edu.iftm.javaempresax.classes;

public class Projeto {

    private int codigo;
    private String titulo;
    private Departamento departamento;

    public Projeto() {
    }

    public Projeto(int codigo, String titulo, Departamento departamento) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.departamento = departamento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", departamento=" + departamento +
                '}';
    }
}

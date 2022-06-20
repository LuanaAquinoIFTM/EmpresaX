
package br.edu.iftm.javaempresax.testes;

import br.edu.iftm.javaempresax.classes.Departamento;
import br.edu.iftm.javaempresax.classes.Empregado;
import br.edu.iftm.javaempresax.classes.Projeto;

import java.util.Date;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        /*Empregado empregado01 = new Empregado();
        empregado01.setCodigo(1);
        empregado01.setNome("Mariana");
        empregado01.setSexo('F');
        Date dataInicio = new Date();
        Departamento d = new Departamento(1,"Pesquisa",1, dataInicio);
        empregado01.setDepartamento(d);
        Projeto p = new Projeto(1,"Transmogrifador", d);
        System.out.println(empregado01);
        System.out.println(p);*/

        Scanner teclado = new Scanner(System.in);

        Projeto[] vetorDeProjetos = new Projeto[5]; //vetor de projeto
        int contadorProjeto = 0;
        //int countProjetos = 0;
        Empregado[] vetorDeEmpregado = new Empregado[5];
        int contadorEmpregado = 0;
        Departamento[] vetorDeDepartamento = new Departamento[5];
        int contadorDepartamento = 0;

        int opcao = 0;
        do {
            System.out.println("Menu");
            System.out.println("1 - Cadastrar Projetos");
            System.out.println("2 - Imprimir Todos os Projetos");
            System.out.println("3 - Cadastrar Empregados");
            System.out.println("4 - Imprimir Todos os Empregados");
            System.out.println("5 - Cadastrar Departamentos");
            System.out.println("6 - Imprimir Todos os Departamentos");
            System.out.println("0 - Sair");
            System.out.println("Digite uma opcao: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    if (contadorProjeto < 5) {
                        System.out.println("Digite o codigo do Projeto: ");
                        int codigo = teclado.nextInt();
                        System.out.println("Digite o nome do Projeto: ");
                        String nome = teclado.next();
                        Projeto p = new Projeto(codigo, nome, null);
                        vetorDeProjetos[contadorProjeto] = p;
                        //vetorDeProjetos[countProjetos] = new Projeto(codigo,nome,null);
                        contadorProjeto++;
                        //countProjetos++;
                    } else {
                        System.out.println("Vetor de projetos está cheio!");
                    }
                    break;
                case 2:
                    for (Projeto obj : vetorDeProjetos) {
                        if (obj != null) {
                            System.out.println(obj);
                        }
                    }
                    break;
                case 3:
                    if (contadorEmpregado < 5) {
                        System.out.println("Digite o código do empregado: ");
                        int codigo = teclado.nextInt();
                        System.out.println("Digite o nome do empregado: ");
                        String nome = teclado.next();
                        System.out.println("Digite a data de nascimento do empregado: ");
                        String datanasc = teclado.next();
                        teclado.nextLine();
                        System.out.println("Digite o endereço do empregado: ");
                        String endereco = teclado.nextLine();
                        System.out.println("Digite o sexo do empregado (F para feminino e M para masculino: ");
                        char sexo = teclado.next().charAt(0);
                        System.out.println("Digite o salário do empregado: ");
                        double salario = teclado.nextDouble();
                        System.out.println("Digite o código do supervisor do empregado: ");
                        int codSuperv = teclado.nextInt();
                        System.out.println("Digite o código do departamento do empregado: ");
                        int codDepto = teclado.nextInt();
                        Empregado e = new Empregado(codigo, nome, null, endereco, sexo, salario,
                                codSuperv, codDepto, null);
                        vetorDeEmpregado[contadorEmpregado] = e;
                        contadorEmpregado++;
                    } else {
                        System.out.println("Vetor de empregados está cheio!");
                    }
                    break;
                case 4:
                    for (Empregado objE : vetorDeEmpregado) {
                        if (objE != null) {
                            System.out.println(objE);
                        }
                    }
                    break;
                case 5:
                    if (contadorDepartamento < 5) {
                        System.out.println("Digite o código do departamneto: ");
                        int codigo = teclado.nextInt();
                        System.out.println("Digite o nome do departamento: ");
                        String nome = teclado.next();
                        System.out.println("Digite o código do gerente do departamento: ");
                        int codGerente = teclado.nextInt();
                        System.out.println("Digite a data do gerente do departamento: ");
                        String dataGerente = teclado.next();
                        Departamento d = new Departamento(codigo, nome, codGerente, null);
                        vetorDeDepartamento[contadorDepartamento] = d;
                        contadorDepartamento++;
                    } else {
                        System.out.println("Vetor de departamentos está cheio!");
                    }
                    break;
                case 6:
                    for (Departamento objD : vetorDeDepartamento) {
                        if (objD != null) {
                            System.out.println(objD);
                        }
                        break;
                    }
                case 7:
                    System.out.println("Digite o código do projeto");
                    int cod = teclado.nextInt();
                    for (Projeto Pr: vetorDeProjetos) {
                        if (Pr != null) {
                            if (Pr.getCodigo() == cod) {
                                System.out.println(Pr);
                            }
                        }
                    }


            }
        } while (opcao != 0);


    }

    }

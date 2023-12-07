package br.edu.ifpe.apoo.entidades;

import java.io.Serializable;

public class Aluno implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    private long id;
    private String nome;
    private String cpf;
    private String email;

    
    public Aluno() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    
    public static class AlunoBuilder {
    	private long id;
        private String nome;
        private String cpf;
        private String email;

        public AlunoBuilder() {
            
        }
        
        public AlunoBuilder id(long id) {
        	this.id = id;
        	return this;
        }

        public AlunoBuilder Nome(String nome) {
            this.nome = nome;
            return this;
        }

        public AlunoBuilder CPF(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public AlunoBuilder Email(String email) {
            this.email = email;
            return this;
        }

        public Aluno build() {
            Aluno aluno = new Aluno();
            aluno.setId(this.id);
            aluno.setNome(this.nome);
            aluno.setCpf(this.cpf);
            aluno.setEmail(this.email);
            return aluno;
        }
    }
    
    @Override
    public Aluno clone() {
        return new AlunoBuilder()
        		.id(this.id)
        		.Nome(this.nome)
                .CPF(this.cpf)
                .Email(this.email)
                .build();
    }
}



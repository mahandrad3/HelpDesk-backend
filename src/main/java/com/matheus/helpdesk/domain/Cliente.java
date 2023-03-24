package com.matheus.helpdesk.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente extends Pessoa {

    @Serial
    private static final long serialVersionUID = 1L;



    @OneToMany(mappedBy = "cliente")
    private List<Chamado> chamados = new ArrayList<>();

    public Cliente() {
        super();
    }

    public Cliente(Integer id, String nome, String email, String cpf, String senha) {
        super(id, nome, email, cpf, senha);
    }

    public List<Chamado> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.model.classes;

import java.util.List;

/**
 *
 * @author ALUNO
 */
public class Usuario {
    
    private int codigo;
    private String cpf;
    private String nome;
    private String email;
    private String senha;
    private String endereco;
    private String cep;
    private String telefone;
    private List<Avaliacao> recebidas;
    private List<Pedido> realizados; 
    private List<Oferta> ofertas;
   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Avaliacao> getRecebidas() {
        return recebidas;
    }

    public void setRecebidas(List<Avaliacao> recebidas) {
        this.recebidas = recebidas;
    }
  
    private double getPontuacaoGeral(){
        double cont = 0;
        
        for(Avaliacao a: recebidas){
            cont += (double)a.getPontuacao();
        }
        
        return cont/recebidas.size();
    }
    
    private List<Avaliacao> getRecebidas(int quantidade){
        
        if(quantidade>=recebidas.size())
            return recebidas;
        
        return recebidas.subList(0, quantidade);
        
    }

    public List<Pedido> getRealizados() {
        return realizados;
    }

    public void setRealizados(List<Pedido> realizados) {
        this.realizados = realizados;
    }

    public List<Oferta> getOfertas() {
        return ofertas;
    }

    public void setOfertas(List<Oferta> ofertas) {
        this.ofertas = ofertas;
    }
    
    
    
}

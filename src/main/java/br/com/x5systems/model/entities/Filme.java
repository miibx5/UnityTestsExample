/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.x5systems.model.entities;

import java.util.Objects;

/**
 *
 * @author eder.costa
 */
public class Filme
{
    private String nome;

    private Integer estoque;

    private Double precoLocacao;

    public Filme()
    {
    }

    public Filme(String nome, Integer estoque, Double precoLocacao)
    {
        this.nome = nome;
        this.estoque = estoque;
        this.precoLocacao = precoLocacao;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Integer getEstoque()
    {
        return estoque;
    }

    public void setEstoque(Integer estoque)
    {
        this.estoque = estoque;
    }

    public Double getPrecoLocacao()
    {
        return precoLocacao;
    }

    public void setPrecoLocacao(Double precoLocacao)
    {
        this.precoLocacao = precoLocacao;
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.estoque);
        hash = 41 * hash + Objects.hashCode(this.precoLocacao);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
        {
            return true;
        }
        if(obj == null)
        {
            return false;
        }
        if(getClass() != obj.getClass())
        {
            return false;
        }
        final Filme other = (Filme) obj;
        if(!Objects.equals(this.nome, other.nome))
        {
            return false;
        }
        if(!Objects.equals(this.estoque, other.estoque))
        {
            return false;
        }
        return Objects.equals(this.precoLocacao, other.precoLocacao);
    }

}

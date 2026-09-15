package br.senac.tads.dsw.exemplo3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity 
public class Avaliacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Não pode ser em branco
    @NotBlank 
    private String autor;

    //Não pode ser em vazio
    @NotNull 
    private String comentario;

    //Valor mínimo 1 e valor máximo 5
    @Min(1)
    @Max(5)
    private Integer nota;

    @ManyToOne // Relação Muitos para 1 do SQL
    @JoinColumn(name = "produto_id")
    private Produto produto;

    public Avaliacao(){
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getComentario(){
        return comentario;
    }

    public void setComentario(String comentario){
        this.comentario = comentario;
    }

    public Integer getNota(){
        return nota;
    }

    public void setNota(Integer nota){
        this.nota = nota;
    }

    public Produto getProduto(){
        return produto;
    }

    public void setProduto(Produto produto){
        this.produto = produto;
    }
}

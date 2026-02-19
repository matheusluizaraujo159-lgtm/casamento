package com.casamento.convite.model;

import jakarta.persistence.*;

@Entity
@Table(name = "convidados")
public class Convidado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    private String telefone;

    @Column(nullable = false)
    private Boolean confirmouPresenca;

    private Integer quantidadeAcompanhantes;

    @Column(columnDefinition = "TEXT")
    private String mensagemAosNoivos;

    // Construtor vazio (obrigatório para o Spring)
    public Convidado() {}

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public Boolean getConfirmouPresenca() { return confirmouPresenca; }
    public void setConfirmouPresenca(Boolean confirmouPresenca) { this.confirmouPresenca = confirmouPresenca; }

    public Integer getQuantidadeAcompanhantes() { return quantidadeAcompanhantes; }
    public void setQuantidadeAcompanhantes(Integer quantidadeAcompanhantes) { this.quantidadeAcompanhantes = quantidadeAcompanhantes; }

    public String getMensagemAosNoivos() { return mensagemAosNoivos; }
    public void setMensagemAosNoivos(String mensagemAosNoivos) { this.mensagemAosNoivos = mensagemAosNoivos; }
}
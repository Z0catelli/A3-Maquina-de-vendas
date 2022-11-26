package a3_maq_vendas_final.classes;

import a3_maq_vendas_final.banco.Banco;
import javax.swing.JOptionPane;

public class Produto {

    private int id;
    private String nome;
    private int quantidade_disponivel;
    private Double preco_compra;
    private Double preco_venda;
    private Double markup;
    private int quantidade_vendida;

    public Produto(int id, String nome, int qtd, Double pCompra, Double pVenda) {
        this.id = id;
        this.nome = nome;
        this.quantidade_disponivel = qtd;
        this.preco_compra = pCompra;
        this.preco_venda = pVenda;
        this.quantidade_vendida = 0;
        calcular_markup();
    }

//Getters e Setter dos atributos
    public int getQuantidade_disponivel() {
        return quantidade_disponivel;
    }

    public void setQuantidade_disponivel(int quantidade_disponivel) {
        this.quantidade_disponivel = quantidade_disponivel;
    }

    public Double getPreco_compra() {
        return preco_compra;
    }

    public void setPreco_compra(Double preco_compra) {
        this.preco_compra = preco_compra;
        calcular_markup();
    }

    public Double getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(Double preco_venda) {
        this.preco_venda = preco_venda;
        calcular_markup();
    }

    public Double getMarkup() {
        return markup;
    }

    public int getQuantidade_vendida() {
        return quantidade_vendida;
    }

// Métodos da classe:
    public void calcular_markup() {
        this.markup = preco_venda - preco_compra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade_vendida(int quantidade_vendida) {
        this.quantidade_vendida = quantidade_vendida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void venda() {
        Banco venda = new Banco();
        //Adicionamos um if para quando o estoque de um produto for menor que 0, não permitir a venda do produto.
        //Estamos tentando fazer com que apareça a mensagem na interface da máquina "Produto indisponivel"
        if (quantidade_disponivel > 0){
            this.setQuantidade_vendida(this.quantidade_vendida + 1);
            this.setQuantidade_disponivel(this.getQuantidade_disponivel() - 1);
            venda.venda(this.nome, this.quantidade_disponivel, this.quantidade_vendida, this.preco_compra, this.preco_venda,this.id);   
            JOptionPane.showMessageDialog(null,"Venda realizada");
        }else{
            JOptionPane.showMessageDialog(null,"Produto indisponivel ");
            System.out.println("Produto indisponivel");
        }
    }

    public void reabastecer(int qtd) {
        this.setQuantidade_disponivel(this.getQuantidade_disponivel() + qtd);
    }
}

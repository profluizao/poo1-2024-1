package dominio;

import java.time.LocalDate;

public abstract class BasePessoa {

    protected int codigo;

    protected String endereco;

    protected String telefone;

    protected LocalDate dataDeInclusao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataDeInclusao() {
        return dataDeInclusao;
    }

    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataDeInclusao = dataDeInclusao;
    }

    public BasePessoa(int codigo, String endereco, String telefone, LocalDate dataDeInclusao) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataDeInclusao = dataDeInclusao;
    }

    @Override
    public String toString() {
        return "BasePessoa [Código = " + codigo + ", Endereço = " + endereco + ", Telefone = " + telefone
                + ", Data de Inclusão = " + dataDeInclusao + "]";
    }    
}
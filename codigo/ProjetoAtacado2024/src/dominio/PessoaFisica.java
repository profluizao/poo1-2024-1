package dominio;

import java.time.LocalDate;

public class PessoaFisica extends BasePessoa{
    private String nome;

    private String cpf;

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

    public PessoaFisica(int codigo, String endereco, String telefone, LocalDate dataDeInclusao, String nome,
            String cpf) {
        super(codigo, endereco, telefone, dataDeInclusao);
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        String mensagem = "Dados em Pessoa Física: \n";
        mensagem += super.toString();
        mensagem += "\n";
        mensagem += "PessoaFisica [Nome = " + nome + ", CPF = " + cpf + "]";
        return mensagem;
    }    
}

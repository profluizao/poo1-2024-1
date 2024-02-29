package dominio;

import java.time.LocalDate;

public class PessoaJuridica extends BasePessoa{
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public PessoaJuridica(int codigo, String endereco, String telefone, LocalDate dataDeInclusao, String razaoSocial,
            String nomeFantasia, String cnpj) {
        super(codigo, endereco, telefone, dataDeInclusao);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }
    @Override
    public String toString() {
        String mensagem = "Dados em Pessoa Jurídica: \n";
        mensagem += super.toString();
        mensagem += "\n";
        mensagem += "PessoaJuridica [Razão Social = " + razaoSocial + ", Nome Fantasia = " + nomeFantasia + ", CNPJ = " + cnpj + "]";
        return mensagem;
    }
}

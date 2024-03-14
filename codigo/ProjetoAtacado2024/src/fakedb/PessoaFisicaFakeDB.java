package fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import dominio.PessoaFisica;

public class PessoaFisicaFakeDB extends BaseFakeDB<PessoaFisica> {

    public PessoaFisicaFakeDB(){
        super();
    }

    @Override
    protected void preencherLista(){
        if (this.lista == null){
            this.lista = new ArrayList<>();

            this.lista.add(new PessoaFisica(1, "Rua X", "3321-1000", LocalDate.now(), "Luiz", "123"));
            this.lista.add(new PessoaFisica(2, "Rua Y", "3321-1001", LocalDate.now(), "Carlos", "100"));
            this.lista.add(new PessoaFisica(3, "Rua A", "3321-1002", LocalDate.now(), "Carol", "121"));
            this.lista.add(new PessoaFisica(4, "Rua B", "3321-1003", LocalDate.now(), "Isabela", "122"));
            this.lista.add(new PessoaFisica(5, "Rua V", "3321-1004", LocalDate.now(), "Kaio", "124"));
            this.lista.add(new PessoaFisica(6, "Rua D", "3321-1005", LocalDate.now(), "Adriane", "125"));
            this.lista.add(new PessoaFisica(7, "Rua E", "3321-1006", LocalDate.now(), "Noiza", "126"));
            this.lista.add(new PessoaFisica(8, "Rua F", "3321-1007", LocalDate.now(), "Lucas", "127"));
            this.lista.add(new PessoaFisica(9, "Rua G", "3321-1008", LocalDate.now(), "Camila", "183"));
            this.lista.add(new PessoaFisica(10, "Rua H", "3321-1009", LocalDate.now(), "Mariana", "103"));
        }
    }
}

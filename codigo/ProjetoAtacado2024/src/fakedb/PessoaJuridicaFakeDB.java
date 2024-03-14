package fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import dominio.PessoaJuridica;

public class PessoaJuridicaFakeDB extends BaseFakeDB<PessoaJuridica> {

    public PessoaJuridicaFakeDB() {
        super();
    }

    @Override
    protected void preencherLista(){
        if (this.lista == null){
            this.lista= new ArrayList<>();

            this.lista.add(new PessoaJuridica(1, "Rua Z", "3200-1000", LocalDate.now(), "Empresa A", "Boteco A", "0001"));
            this.lista.add(new PessoaJuridica(2, "Rua Y", "3200-1001", LocalDate.now(), "Empresa B", "Boteco B", "0002"));
            this.lista.add(new PessoaJuridica(3, "Rua W", "3200-1002", LocalDate.now(), "Empresa V", "Boteco C", "0003"));
            this.lista.add(new PessoaJuridica(4, "Rua T", "3200-1003", LocalDate.now(), "Empresa D", "Boteco D", "0004"));
            this.lista.add(new PessoaJuridica(5, "Rua S", "3200-1004", LocalDate.now(), "Empresa E", "Boteco E", "0005"));
            this.lista.add(new PessoaJuridica(6, "Rua O", "3200-1005", LocalDate.now(), "Empresa U", "Boteco F", "0006"));
            this.lista.add(new PessoaJuridica(7, "Rua P", "3200-1006", LocalDate.now(), "Empresa Z", "Boteco G", "0007"));
            this.lista.add(new PessoaJuridica(8, "Rua Q", "3200-1007", LocalDate.now(), "Empresa X", "Boteco H", "0008"));
            this.lista.add(new PessoaJuridica(9, "Rua R", "3200-1008", LocalDate.now(), "Empresa W", "Boteco I", "0009"));
            this.lista.add(new PessoaJuridica(10, "Rua M", "3200-1009", LocalDate.now(), "Empresa T", "Boteco J", "0010"));
        }
    }
    

}

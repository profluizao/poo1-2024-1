package servico;

import java.util.List;

import dominio.PessoaFisica;
import repositorio.PessoaFisicaRepositorio;

public class PessoaFisicaServico 
    extends BaseServico<PessoaFisicaRepositorio, PessoaFisica> {

    public PessoaFisicaServico(){
        this.repo = new PessoaFisicaRepositorio();
    }

    @Override
    public List<PessoaFisica> Browse() {
        return this.repo.ReadAll();
    }

    @Override
    public PessoaFisica Read(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public Boolean Edit(PessoaFisica obj) {
        return this.repo.Update(obj);
    }

    @Override
    public void Add(PessoaFisica obj) {
        this.repo.Create(obj);
    }

    @Override
    public Boolean Delete(int codigo) {
        return this.repo.Delete(codigo);
    }
}

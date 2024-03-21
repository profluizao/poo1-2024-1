package Servico;

import java.util.List;

import dominio.PessoaJuridica;
import repositorio.PessoaJuridicaRepositorio;

public class PessoaJuridicaServico 
    extends BaseServico<PessoaJuridicaRepositorio, PessoaJuridica>{

    public PessoaJuridicaServico(){
        this.repo = new PessoaJuridicaRepositorio();
    }

    @Override
    public List<PessoaJuridica> Browse() {
        return this.repo.ReadAll();
    }

    @Override
    public PessoaJuridica Read(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public Boolean Edit(PessoaJuridica obj) {
        return this.repo.Update(obj);
    }

    @Override
    public void Add(PessoaJuridica obj) {
        this.repo.Create(obj);
        
    }

    @Override
    public Boolean Delete(int codigo) {
        return this.repo.Delete(codigo);
    }
}

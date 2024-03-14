package repositorio;

import dominio.PessoaJuridica;
import fakedb.PessoaJuridicaFakeDB;

public class PessoaJuridicaRepositorio extends BaseRepositorio<PessoaJuridica> {

    public PessoaJuridicaRepositorio(){
        PessoaJuridicaFakeDB db = new PessoaJuridicaFakeDB();
        this.storage = db.getLista();
    }

    @Override
    public void Create(PessoaJuridica instancia) {
        PessoaJuridica pj = this.storage.getLast();
        int novoCodigo = pj.getCodigo() + 1;
        instancia.setCodigo(novoCodigo);
        this.storage.add(instancia);        
    }

    @Override
    public PessoaJuridica Read(int codigo) {
        for (PessoaJuridica pj : this.storage) {
            if (pj.getCodigo() == codigo){
                return pj;
            }
        }
        return null;
    }

    @Override
    public Boolean Update(PessoaJuridica instancia) {
        PessoaJuridica pj = this.Read(instancia.getCodigo());
        if (pj != null){
            pj.setEndereco(instancia.getEndereco());
            pj.setNomeFantasia(instancia.getNomeFantasia());
            pj.setRazaoSocial(instancia.getRazaoSocial());
            pj.setTelefone(instancia.getTelefone());
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public Boolean Delete(int codigo) {
        PessoaJuridica pj = this.Read(codigo);
        if (pj != null){
            this.storage.remove(pj);
            return true;
        }
        else {
            return false;
        }
    }
}

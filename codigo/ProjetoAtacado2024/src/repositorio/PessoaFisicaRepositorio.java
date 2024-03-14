package repositorio;

import dominio.PessoaFisica;
import fakedb.PessoaFisicaFakeDB;

public class PessoaFisicaRepositorio extends BaseRepositorio<PessoaFisica> {
    
    public PessoaFisicaRepositorio(){
        PessoaFisicaFakeDB db = new PessoaFisicaFakeDB();
        this.storage = db.getLista();
    }

    @Override
    public void Create(PessoaFisica instancia) {
        PessoaFisica p = this.storage.getLast();
        int novoCodigo = p.getCodigo() + 1;
        instancia.setCodigo(novoCodigo);
        this.storage.add(instancia);        
    }

    @Override
    public PessoaFisica Read(int codigo) {
        for (PessoaFisica pf : this.storage) {
            if (pf.getCodigo() == codigo){
                return pf;
            }
        }
        return null;
    }

    @Override
    public Boolean Update(PessoaFisica instancia) {
        PessoaFisica pf = this.Read(instancia.getCodigo());
        if (pf != null) {
            pf.setCpf(instancia.getCpf());
            pf.setEndereco(instancia.getEndereco());
            pf.setNome(instancia.getNome());
            pf.setTelefone(instancia.getTelefone());
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Boolean Delete(int codigo) {
        PessoaFisica pf = this.Read(codigo);
        if (pf != null){
            this.storage.remove(pf);
            return true;
        }
        else {
            return false;
        }
    }
}

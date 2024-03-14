package repositorio;

import java.util.List;

public abstract class BaseRepositorio<TDominio> {

    protected List<TDominio> storage;

    public abstract void Create(TDominio instancia);

    public abstract TDominio Read(int codigo);

    public List<TDominio> ReadAll(){
        return storage;
    }

    public abstract Boolean Update(TDominio instancia);

    public abstract Boolean Delete(int codigo);
}
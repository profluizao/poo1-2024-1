package servico;

import java.util.List;

public abstract class BaseServico<TRepositorio, TDominio> {

    protected TRepositorio repo;

    //Browse -> ReadAll
    public abstract List<TDominio> Browse();

    //Read -> Read
    public abstract TDominio Read(int codigo);
    
    //Edit -> Update
    public abstract Boolean Edit(TDominio obj);
    
    //Add -> Create
    public abstract void Add(TDominio obj);
    
    //Delete -> Delete
    public abstract Boolean Delete(int codigo);
}
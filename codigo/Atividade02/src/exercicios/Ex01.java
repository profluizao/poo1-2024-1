package exercicios;

public class Ex01 extends BaseCalculo implements IOperacao{
    public Ex01(int v1, int v2){
        super(v1, v2);
    }
    
    @Override
    public void Executar(){
        res = v1 + v2;
    }

    @Override
    public void Imprimir(){
        System.out.println("Resultado : " + res);;
    }
}
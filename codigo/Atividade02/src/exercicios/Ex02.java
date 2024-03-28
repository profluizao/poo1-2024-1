package exercicios;

public class Ex02 extends BaseCalculo implements IOperacao{
    public Ex02(int v1, int v2) {
        super(v1, v2);
    }

    @Override
    public void Executar(){
        res = v1 * v2;
    }

    @Override
    public void Imprimir(){
        System.out.println("Resultado : " + res);;
    }    
}

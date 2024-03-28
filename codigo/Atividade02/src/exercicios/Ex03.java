package exercicios;

public class Ex03 extends BaseCalculo implements IOperacao {

    private int v3;

    public Ex03(int v1, int v2, int v3) {
        super(v1, v2);
        this.v3 = v3;
    }

    @Override
    public void Executar() {
        this.res = (v1 + v2 + v3) / 3;
    }

    @Override
    public void Imprimir() {
        System.out.println("Resultado: " + this.res);
    }
    
}

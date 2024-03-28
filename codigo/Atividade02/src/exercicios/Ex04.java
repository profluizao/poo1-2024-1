package exercicios;

public class Ex04 implements IOperacao{

    private int val, ant, suc;

    public Ex04(int val) {
        this.val = val;
    }

    @Override
    public void Executar() {
        this.ant = this.val-1;
        this.suc = this.val+1;
    }

    @Override
    public void Imprimir() {
        System.out.println("antecessor: " + this.ant + ", sucessor: " + this.suc);
    }
    
}

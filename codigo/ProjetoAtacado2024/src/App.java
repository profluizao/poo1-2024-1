import dominio.*;
import fakedb.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-- Lista de Pessoas Físicas --");
        PessoaFisicaFakeDB db = new PessoaFisicaFakeDB();
        for (PessoaFisica pessoaFisica : db.getLista()) {
            System.out.println(pessoaFisica.toString());
        }
        
        System.out.println();
        
        System.out.println("-- Lista de Pessoas Jurídicas --");
        PessoaJuridicaFakeDB nb = new PessoaJuridicaFakeDB();
        for (PessoaJuridica pj : nb.getLista()) {
            System.out.println(pj.toString());
        }

        PessoaFisicaFakeDB dbf = new PessoaFisicaFakeDB();
        for (PessoaFisica pf : dbf.getLista()) {
            if (pf.getCodigo() == 7){
                System.out.println(pf.toString());
            }
        }
    }
}

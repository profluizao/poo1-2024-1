import java.time.LocalDate;

import dominio.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        PessoaFisica pf1 = new PessoaFisica(1, 
            "Rua X", 
            "33211234", 
            LocalDate.now(), 
            "André", 
            "123");
        System.out.println(pf1.toString());

        System.out.println("----------------------------------------------");

        PessoaJuridica pj1 = new PessoaJuridica(1000, 
        "Rua Z", 
        "32154567", 
        LocalDate.now(), 
        "Zezinho Empreendimentos", 
        "Bolicho do Zé", 
        "987");
        System.out.println(pj1.toString());
    }
}

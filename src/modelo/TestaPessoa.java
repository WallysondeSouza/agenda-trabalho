package modelo;

import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class TestaPessoa {
    static Pessoa pessoa = new Pessoa();
    public static void main(String[] args) {
        pessoa.setNome("Wallyson");
        pessoa.setDataNascimento(LocalDate.of(1995,8,13));
        pessoa.setAltura(1.60);
        System.out.println(pessoa);
           
    }
}

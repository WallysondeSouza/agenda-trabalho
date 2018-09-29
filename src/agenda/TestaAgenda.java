package agenda;

import java.util.Scanner;

public class TestaAgenda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Agenda agenda = new Agenda();
        agenda.armazenarPessoa("Wallyson", 21, 1.60);
        agenda.armazenarPessoa("Pedro", 18, 1.80);
        agenda.imprimeAgenda();
        agenda.imprimePessoa(0);
        System.out.println(agenda.buscarPessoa("Wallyson"));
        agenda.removerPessoa("Wallyson");
        agenda.imprimeAgenda();   
    }
}

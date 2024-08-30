package front;

import dao.PessoaDao;
import general.ProgramaPessoa;

import java.util.Scanner;

public class MenuAdmin {
    private ProgramaPessoa programaPessoa;
    private PessoaDao pessoaDao;

    public MenuAdmin(PessoaDao pessoaDao){
        this.pessoaDao = pessoaDao;

        this.programaPessoa = new ProgramaPessoa(pessoaDao);
    }

    public void selecioneOpc(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("");
            System.out.println("1) Cria pessoa");

            int opc = scanner.nextInt();
            scanner.nextLine();

            switch (opc){
                case 1:
                    programaPessoa.mostrarMenu();
                    break;
            }
        }
    }

}

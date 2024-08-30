package front;

import dao.PessoaDao;

import java.util.Scanner;

public class Login {
    private MenuAdmin menuAdmin;
    private PessoaDao pessoaDao;

    public Login(PessoaDao pessoaDao){
        this.pessoaDao = pessoaDao;


        this.menuAdmin = new MenuAdmin(pessoaDao);
    }

    public void selecioneOpc(){
        Scanner scanner = new Scanner(System.in);
            while (true){
                int condicao = 0;
                while (condicao == 0)
                {
                    System.out.println("Digite o usuario");
                    String login = scanner.nextLine();
                }
            }
    }
}

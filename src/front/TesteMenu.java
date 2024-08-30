package front;

import dao.PessoaDao;

import java.util.Scanner;

public class TesteMenu {
    private MenuAdmin menuAdmin;

private void mostrarMenu(){

    var PessoaDao = new PessoaDao();
    this.menuAdmin = new MenuAdmin(PessoaDao);
}

    public void SelecionaOpc()
    {
        Scanner scanner = new Scanner(System.in);

        while (true){
            int condicao = 0;

            while (condicao == 0)
            {
                System.out.println("Digite seu login: ");
                String login = scanner.nextLine();
                System.out.println("Digite sua senha");
                String senha = scanner.nextLine();
                int qualquerMerda = login(login, senha);

                switch (){
                    case 1:
                        menuAdmin.selecioneOpc();

                    default:
                        condicao = 0;
                        break;
                }
            }
        }

    }
}

import java.util.*;

public class Main {

    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = read.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = read.nextInt();
        System.out.print("Digite como se sente hoje: ");
        read = new Scanner(System.in);
        String sentimento = read.nextLine();
        System.out.print("Qual é o seu genero? ");
        char genero = read.nextLine().charAt(0);
        Pessoa voce = new Pessoa(nome,idade,sentimento,genero);
        Pessoa guilherme = new Pessoa("Guilherme",19,"Feliz",'M');
        boolean ficar = true;
        do {
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Saudar");
            System.out.println("2 - Apresentar");
            System.out.println("3 - Mostrar seu sentimentos");
            System.out.println("4 - Sair");
            int resposta = read.nextInt();
            switch (resposta){
                case 1:
                    System.out.println("- " + voce.DarSaudacao());
                    System.out.println("- " + guilherme.ResponderSaudacao());
                    break;
                case 2:
                    System.out.println("- " + voce.Apresentar());
                    System.out.println("- " + guilherme.ResponderApresentacao());
                    break;
                case 3:
                    System.out.println("- " + voce.MostrarSentimento());
                    System.out.println("- " + guilherme.ResponderSentimento());
                    break;
                case 4:
                    ficar = false;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }while (ficar);
    }
}


import java.util.*;

public class Main {
    public static Scanner LER = new Scanner(System.in); //okay
    public static List<Pessoa> clientes = new ArrayList<>();
    public static List<Funcionario> funcionarios = new ArrayList<>();
    public static List<Livro> livros = new ArrayList<>();
    public static List<Emprestimo> emprestimos = new ArrayList<>();
    public static List<Autor> autores = new ArrayList<>();

    public static void main(String[] args) {
        char opcaoLogin;

        exibirCabecalho();
        System.out.println("Bem-vindo a Biblioteca Thunder Day!\n");//okay
        System.out.println("1. Deseja fazer login como cliente?");
        System.out.println("2. Deseja fazer login como funcionario?");

        opcaoLogin = lerRestricaoRec('1', '2');

        if (opcaoLogin == '1') {
            Pessoa cliente = cadastrarPessoa();
            clientes.add(cliente);
            menuCliente(cliente, cliente);
        } else if (opcaoLogin == '2') {
            Funcionario funcionario = cadastrarFuncionario();
            funcionarios.add(funcionario);
            menuFuncionario(funcionario);
        }
    }

    public static void exibirCabecalho() {
        System.out.println(" ____  _ _     _ _       _                                    ");
        System.out.println("| __ )(_) |__ | (_) ___ | |_ ___  ___ __ _                    ");//okay
        System.out.println("|  _ \\| | '_ \\| | |/ _ \\| __/ _ \\/ __/ _` |                   ");
        System.out.println("| |_) | | |_) | | | (_) | ||  __/ (_| (_| |                   ");
        System.out.println("|____/|_|_.__/|_|_|\\___/ \\__\\___|\\___\\__,_|____               ");
        System.out.println("|_   _| |__  _   _ _ __   __| | ___ _ __  | __ )  __ _ _   _  ");
        System.out.println("  | | | '_ \\| | | | '_ \\ / _` |/ _ \\ '__| |  _ \\ / _` | | | | ");
        System.out.println("  | | | | | | |_| | | | | (_| |  __/ |    | |_) | (_| | |_| | ");
        System.out.println("  |_| |_| |_|\\__,_|_| |_|\\__,_|\\___|_|    |____/ \\__,_|\\__, |");
        System.out.println("                                                       |___/ ");
    }

    public static Pessoa cadastrarPessoa() {
        System.out.println("\nCADASTRO DE CLIENTE:"); //okay
        System.out.print("Nome: ");
        String nome = LER.nextLine();
        System.out.print("CPF: ");
        String cpf = LER.nextLine();
        System.out.print("Senha: ");
        String senha = LER.nextLine();
        System.out.print("Endereço: ");
        String endereco = LER.nextLine();
        System.out.print("Email: ");
        String email = LER.nextLine();
        System.out.print("Telefone: ");
        String telefone = LER.nextLine();
        System.out.print("Data de nascimento: ");
        String nascimentoC = LER.nextLine();
        System.out.print("Cep: ");
        String cep = LER.nextLine();
        System.out.print("cidade/estado: ");
        String cddEstado = LER.nextLine();
        System.out.print("Genero: ");
        String genero = LER.nextLine();

        
        Pessoa p = new Pessoa(nome, cpf, senha, endereco, email, telefone, nascimentoC, cep, cddEstado, genero);
        return p;
    }

    public static Funcionario cadastrarFuncionario() {
        System.out.println("\nCADASTRO DE FUNCIONÁRIO:");
    
        System.out.print("Nome: ");
        String nome = LER.nextLine();
        System.out.print("CPF: ");
        String cpf = LER.nextLine();
        System.out.print("Senha: ");
        String senha = LER.nextLine();
        System.out.print("Endereço: ");
        String endereco = LER.nextLine();
        System.out.print("Email: ");
        String email = LER.nextLine();
        System.out.print("Telefone: ");
        String telefone = LER.nextLine();
        System.out.print("Data de nascimento: ");
        String nascimento = LER.nextLine();
        System.out.print("CEP: ");
        String cep = LER.nextLine();
        System.out.print("Cidade/Estado: ");
        String cddEstado = LER.nextLine();
        System.out.print("Gênero: ");
        String genero = LER.nextLine();
    
        System.out.print("RG: ");
        String rg = LER.nextLine();
        System.out.print("Escolaridade: ");
        String escolaridade = LER.nextLine();
        System.out.print("CTPS: ");
        String ctps = LER.nextLine();
        System.out.print("Banco: ");
        String banco = LER.nextLine();
        System.out.print("Cargo: ");
        String cargo = LER.nextLine();
        System.out.print("Estado civil: ");
        String estadoCivil = LER.nextLine();
        System.out.print("Tipo de contrato: ");
        String tipoContrato = LER.nextLine();
        System.out.print("Salário: ");
        String salario = LER.nextLine();
    
        return new Funcionario(nome, cpf, senha, endereco, email, telefone, nascimento,
                               cep, cddEstado, genero, rg, escolaridade, ctps, banco,
                               cargo, estadoCivil, tipoContrato, salario);
    }
    
    public static void menuCliente(Pessoa cliente, Pessoa p) {//+/-
        char opcao;
        do {
            System.out.println("\n--- MENU CLIENTE ---");
            System.out.println("1. Fazer Empréstimo");
            System.out.println("2. Ver Meus Empréstimos");
            System.out.println("3. Meus Dados");
            System.out.println("4. Sair");

            opcao = lerRestricaoRec('1', '2', '3', '4');

            switch (opcao) {
                case '1':
                    System.out.println("\nSenha:");
                    String senha = LER.nextLine();
                    System.out.println("\nLivros para empréstimo:");
                    String livro = LER.nextLine();
                    System.out.println("\nData de empréstimo:");
                    String emprestimo = LER.nextLine();
                    System.out.println("\nDevolução:");
                    String devolucao = LER.nextLine();
                    System.out.println("\nEmpréstimo concluído do(s) livro(s): " + livro + "!");
                    break;
    
                case '2':
                    // Ainda vai implementar
                    break;
    
                case '3':
                    System.out.println("\n--- MEUS DADOS ---");
                    System.out.println("Nome: " + cliente.getNome());
                    System.out.println("CPF: " + cliente.getCpf());
                    System.out.println("Endereço: " + cliente.getEndereco());
                    System.out.println("Email: " + cliente.getEmail());
                    System.out.println("Telefone: " + cliente.getTelefone());
                    System.out.println("Nascimento: " + cliente.getNascimento());
                    System.out.println("CEP: " + cliente.getCep());
                    System.out.println("Cidade/Estado: " + cliente.getCddEstado());
                    System.out.println("Gênero: " + cliente.getGenero());
                    break;
    
                case '4':
                    System.out.println("Obrigado pela visita!");
                    break;
            }
        } while (opcao != '4');
    }

    public static void menuFuncionario(Funcionario funcionario) {
        char opcao;
        do {
            System.out.println("\n--- MENU FUNCIONÁRIO ---");
            System.out.println("1. Fazer Empréstimo");
            System.out.println("2. Cadastrar Livro");
            System.out.println("3. Cadastrar Autor");
            System.out.println("4. Sair");

            opcao = lerRestricaoRec('1', '2', '3', '4');

            switch (opcao) {
                case '1':
                System.out.println("Nome: ");
                String nomeC = LER.nextLine();
                System.out.println("\nSenha:");
                String senha = LER.nextLine();
                System.out.println("\nLivros para empréstimo:");
                String livro = LER.nextLine();
                System.out.println("\nData de empréstimo:");
                String emprestimo = LER.nextLine();
                System.out.println("\nDevolução:");
                String devolucao = LER.nextLine();
                System.out.println("\nFuncionario: ");
                String nomeF = LER.nextLine();
                System.out.println("\nEmpréstimo concluído do(s) livro(s): " + livro + "!");
                    break;
                case '2':
                System.out.println("\nNome do livro: ");
                String nomeL = LER.nextLine();
                System.out.println("\nEditora: ");
                String editora = LER.nextLine();
                System.out.println("\nAutor: ");
                String autor = LER.nextLine();
                System.out.println("\nQuantidade de paginas: ");
                String qtdPagina = LER.nextLine();
                System.out.println("\nQuantidade de exemplar: ");
                String qtdExemplar = LER.nextLine();
                System.out.println("\nIdioma: ");
                String idioma = LER.nextLine();
                System.out.println("\nSinopse: ");
                String sinopse = LER.nextLine();
                    break;
                case '3':
                System.out.println("\nNome do Autor: ");
                String nomeA = LER.nextLine();
                System.out.println("\nNascionalidade: ");
                String nascionalidade = LER.nextLine();
                System.out.println("\nIdentificador de Autoridade: ");
                String identificadorAutoridade = LER.nextLine();
                System.out.println("\nQuantidade de livros na biblioteca: ");
                System.out.println("Autor cadastrado!");
                String qtdL = LER.nextLine();
                    break;
                case '4':
                    break;
            }

        } while (opcao != '4');
    }

    public static char lerRestricaoRec(char... opcoesValidas) {
        char opcao = LER.next().charAt(0);
        LER.nextLine(); // Limpar buffer

        for (char c : opcoesValidas) {
            if (opcao == c) return opcao;
        }
        System.out.println("Digite uma entrada válida!");
        return lerRestricaoRec(opcoesValidas);
    }

   
}
    


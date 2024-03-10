package view;

import java.util.List;
import java.util.Scanner;

import model.Event;
import model.Usuario;

public class EventManagerView {
    private Scanner scanner;

    public EventManagerView() {
        scanner = new Scanner(System.in);
    }
    
    public void displaylogin() {
        System.out.println("1. Cadastro de Usuario: ");
        System.out.println("2. Login: ");


    };

    public void displayMainMenu() {
        System.out.println("\nMenu Principal:");
        System.out.println("1. Mostrar Todos os Usuarios");
        System.out.println("2. Cadastro de Evento");
        System.out.println("3. Mostrar Todos os Eventos");
        System.out.println("4. Mostrar Eventos Próximos");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public void displayEventMenu() {
        System.out.println("\nCadastro de Evento:");
        System.out.print("Digite o nome do evento: ");
    }

    public void displayUserMenu() {
        System.out.println("\nCadastro de Usuário:");
        System.out.print("Digite o nome do usuário: ");
    }

    public String getUserInput() {
        return scanner.nextLine();
    }
    
    public void displayUsers(List<Usuario> users) {
        System.out.println("\nTodos os Usuarios:");
        for (Usuario user : users) {
            System.out.println("Nome: " + user.getNome());
            System.out.println("Cidade: " + user.getCidade());
            System.out.println("Email: " + user.getEmail());
            System.out.println("Idade: " + user.getIdade());
            System.out.println();
        }
    }

    public void displayEvents(List<Event> events) {
        System.out.println("\nTodos os Eventos:");
        for (Event event : events) {
            System.out.println("Nome: " + event.getNome());
            System.out.println("Endereço: " + event.getEndereco());
            System.out.println("Categoria: " + event.getCategoria());
            System.out.println("Hora: " + event.getHora());
            System.out.println("Descrição: " + event.getDescricao());
            System.out.println();
        }
    }

    public void displayUpcomingEvents(List<Event> events) {
        System.out.println("\nPróximos Eventos:");
        for (Event event : events) {
            System.out.println("Nome: " + event.getNome());
            System.out.println("Endereço: " + event.getEndereco());
            System.out.println("Categoria: " + event.getCategoria());
            System.out.println("Hora: " + event.getHora());
            System.out.println("Descrição: " + event.getDescricao());
            System.out.println();
        }
    }
}

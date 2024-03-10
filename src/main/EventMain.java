package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import controller.EventManagerController;
import model.Usuario;
import view.EventManagerView;

public class EventMain {
    public static void main(String[] args) {
        EventManagerView view = new EventManagerView();
        Scanner scanner = new Scanner(System.in);
        EventManagerController controller = new EventManagerController();
        
        Boolean a= true;
        Usuario login= null;
        
        view.displaylogin();
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("1")) {
        	choice = "c";
        } else {
        	choice = "l";
        }
        
        while (a) {
        	

            switch (choice) {
            
            	case "1":
            		view.displaylogin();
                    choice = scanner.nextLine();
                    if (choice.equalsIgnoreCase("1")) {
                    	choice = "c";
                    } else {
                    	choice = "l";
                    }

                    
                    
            	case "2":
            		controller.displayUsers();
            		System.out.print("Voltar para o menu principal s/n? ");
            		choice = scanner.nextLine();
            		choice = choice.toLowerCase();
            		break;
            		
            	case "3":
                    view.displayEventMenu();
                    String eventName = scanner.nextLine();
                    System.out.print("Digite o endereço do evento: ");
                    String eventAddress = scanner.nextLine();
                    System.out.print("Digite a categoria do evento: ");
                    String eventCategory = scanner.nextLine();
                    System.out.print("Digite a descrição do evento: ");
                    String eventDescription = scanner.nextLine();
                    System.out.print("Digite a data e hora do evento: ");
                    String eventDateTime = scanner.nextLine();
                    DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm");
                    LocalDateTime dateTime = LocalDateTime.parse(eventDateTime, parser);
                    
                    controller.addEvent(eventName, eventAddress, eventCategory, dateTime, eventDescription);
                    break;
                    
                case "4":
                    controller.displayEvents();
                    break;
                    
                case "5":
                    controller.displayUpcomingEvents();
                    break;
                    
                case "6":
                    System.out.println("Saindo...");
                    a = false;
                    scanner.close();
                    System.exit(0);
                    
                case "s":
                    view.displayMainMenu();
                    choice = scanner.nextLine();
                    break;
                    
                case "n":
                    System.out.println("Saindo...");
                    a = false;
                    scanner.close();
                    System.exit(0);
                    
                case "c":
                	view.displayUserMenu();
                    String userName = scanner.nextLine();
                    System.out.print("Digite o usuario: ");
                    String usuario = scanner.nextLine();
                    System.out.print("Digite a senha: ");
                    String userSenha = scanner.nextLine();
                    System.out.print("Digite a cidade do usuário: ");
                    String userCity = scanner.nextLine();
                    System.out.print("Digite o email do usuário: ");
                    String userEmail = scanner.nextLine();
                    System.out.print("Digite a idade do usuário: ");
                    int userAge = scanner.nextInt();
                    scanner.nextLine(); 
                    
                    Usuario user = new Usuario(userName, usuario, userSenha,  userCity, userEmail, userAge);
                    controller.addUsuario(user);
                    
                case "l":
                	System.out.println("Usuario: ");
                	String userLogin = scanner.nextLine();
                	System.out.println("Senha: ");
                	String userPass = scanner.nextLine();
                	
                	
                case "7":
                    login = null;
                    choice = "1";
                    break;
                	
                	
                    
                default:
                    System.out.println("Escolha inválida");
            }
        }
    }
}

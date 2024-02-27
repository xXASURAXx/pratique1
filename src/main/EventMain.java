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
        


        while (true) {
        	
            view.displayMainMenu();
            String choice = scanner.nextLine();

            switch (choice) {
            
            	case "1":
            		view.displayUserMenu();
                    String userName = scanner.nextLine();
                    System.out.print("Digite a cidade do usuário: ");
                    String userCity = scanner.nextLine();
                    System.out.print("Digite o email do usuário: ");
                    String userEmail = scanner.nextLine();
                    System.out.print("Digite a idade do usuário: ");
                    int userAge = scanner.nextInt();
                    scanner.nextLine(); 

                    Usuario user = new Usuario(userName, userCity, userEmail, userAge);
                    controller.addUsuario(user);
                    
            	case "2":
            		controller.displayUsers();
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
                    scanner.close();
                    System.exit(0);
                    
                default:
                    System.out.println("Escolha inválida");
            }
        }
    }
}

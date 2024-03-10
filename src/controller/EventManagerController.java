package controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import model.Event;
import model.Usuario;
import view.EventManagerView;

public class EventManagerController {
    private List<Event> events;
    private EventManagerView view;
    private List<Usuario> users;
    
    
    public EventManagerController() {
    	this.view = new EventManagerView();
        events = new ArrayList<>();
        users = new ArrayList<>();
	}
    
    
    public void addEvent(String name, String address, String category, LocalDateTime dateTime, String description) {
        Event event = new Event(name, address, category, dateTime, description);
        events.add(event);
    }
    
    public void addUsuario(Usuario user) {
        users.add(user);
    }
    
    public Usuario logar(String usuario, String senha) {
    	for (Usuario u : users) {
			if ()
		}
    	
    }

    public List<Event> getEvents() {
        return events;
    }
    
    public List<Usuario> getUsers() {
        return users;
    }

    public void displayEvents() {
        view.displayEvents(events);
    }
    
    public void displayUsers() {
        view.displayUsers(users);
    }

    public void displayUpcomingEvents() {
        List<Event> upcomingEvents = new ArrayList<>();
        for (Event event : events) {
           {
                upcomingEvents.add(event);
            }
        }
        view.displayUpcomingEvents(upcomingEvents);
    }
}

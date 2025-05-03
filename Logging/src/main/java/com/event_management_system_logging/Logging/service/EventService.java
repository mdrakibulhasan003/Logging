package com.event_management_system_logging.Logging.service;

import com.event_management_system_logging.Logging.model.Event;
import com.event_management_system_logging.Logging.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventService {
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAllEvents(){
        return eventRepository.findAll();
    }

    public void logEvent(String level, String message){
        Event event = new Event(level, message, LocalDateTime.now().toString());
        eventRepository.save(event);
    }
}

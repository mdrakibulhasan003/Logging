package com.event_management_system_logging.Logging.controller;

import com.event_management_system_logging.Logging.service.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/events")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public String listEvents(Model model){
        model.addAttribute("events", eventService.getAllEvents());
        return "event-list";
    }
}

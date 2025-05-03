package com.event_management_system_logging.Logging.runner;

import com.event_management_system_logging.Logging.service.EventService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EventLoggerRunner implements ApplicationRunner {

    private final EventService eventService;

    public EventLoggerRunner(EventService eventService) {
        this.eventService = eventService;
    }

    public void run(ApplicationArguments args) throws Exception{
        eventService.logEvent("INFO", "Application started successfully.");
        eventService.logEvent("WARN", "Low disk space detected");
        eventService.logEvent("ERROR", "Failed to connect to external service.");
    }
}

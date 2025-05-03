package com.event_management_system_logging.Logging.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String level;
    private String message;
    private String timestamp;

    public Event() {
    }

    public Event(String level, String message) {
        this.level = level;
        this.message = message;
    }

    public Event(String timestamp, String message, String level) {
        this.timestamp = timestamp;
        this.message = message;
        this.level = level;
    }

    public Event(Long id, String level, String message, String timestamp) {
        this.id = id;
        this.level = level;
        this.message = message;
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}

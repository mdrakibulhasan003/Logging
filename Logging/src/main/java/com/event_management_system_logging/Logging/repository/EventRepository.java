package com.event_management_system_logging.Logging.repository;

import com.event_management_system_logging.Logging.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}

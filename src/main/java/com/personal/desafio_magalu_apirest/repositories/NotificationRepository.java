package com.personal.desafio_magalu_apirest.repositories;

import com.personal.desafio_magalu_apirest.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}

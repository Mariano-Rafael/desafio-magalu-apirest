package com.personal.desafio_magalu_apirest.services;

import com.personal.desafio_magalu_apirest.dtos.NotificationDTO;
import com.personal.desafio_magalu_apirest.repositories.NotificationRepository;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void saveNotification(NotificationDTO notificationDTO) {
}
}

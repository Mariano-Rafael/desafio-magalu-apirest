package com.personal.desafio_magalu_apirest.services;

import com.personal.desafio_magalu_apirest.dtos.NotificationDTO;
import com.personal.desafio_magalu_apirest.entities.Notification;
import com.personal.desafio_magalu_apirest.entities.enums.StatusEnum;
import com.personal.desafio_magalu_apirest.repositories.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void saveNotification(NotificationDTO notificationDTO) {

        notificationRepository.save(notificationDTO.toNotification());
    }

    public Optional<Notification> findById(Long notificationId) {
        return notificationRepository.findById(notificationId);
    }

    public void cancelNotificationById(Long notificationId) {
        Optional<Notification> notification = findById(notificationId);

        if (notification.isPresent()) {

            notification.get().setStatusEnum(StatusEnum.CANCELED);

            notificationRepository.save(notification.get());
        }

    }
}

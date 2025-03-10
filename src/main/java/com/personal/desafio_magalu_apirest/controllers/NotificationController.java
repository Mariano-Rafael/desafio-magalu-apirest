package com.personal.desafio_magalu_apirest.controllers;

import com.personal.desafio_magalu_apirest.dtos.NotificationDTO;
import com.personal.desafio_magalu_apirest.entities.Notification;
import com.personal.desafio_magalu_apirest.services.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<Void> createNotification(@RequestBody NotificationDTO notificationDTO) {
        notificationService.saveNotification(notificationDTO);

        return ResponseEntity.ok().build();

    }

    @GetMapping("/{notificationId}")
    public ResponseEntity<Notification> getNotification(@PathVariable("notificationId") Long notificationId) {

        Optional<Notification> notification = notificationService.findById(notificationId);

        return notification.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{notificationId}")
    public ResponseEntity<Void> cancelNotification(@PathVariable("notificationId") Long notificationId) {

        notificationService.cancelNotificationById(notificationId);

        return ResponseEntity.ok().build();
    }
}

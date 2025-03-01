package com.personal.desafio_magalu_apirest.entities;

import com.personal.desafio_magalu_apirest.entities.enums.ChannelEnum;
import com.personal.desafio_magalu_apirest.entities.enums.StatusEnum;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_notification")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dateTime;
    private String destination;
    private String message;

    @Enumerated(EnumType.STRING)
    private ChannelEnum channel;

    @Enumerated(EnumType.STRING)
    private StatusEnum statusEnum;

    public Notification() {
    }

    public Notification(LocalDateTime dateTime, String destination, String message, ChannelEnum channel, StatusEnum statusEnum) {
        this.dateTime = dateTime;
        this.destination = destination;
        this.message = message;
        this.channel = channel;
        this.statusEnum = statusEnum;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ChannelEnum getChannel() {
        return channel;
    }

    public void setChannel(ChannelEnum channel) {
        this.channel = channel;
    }

    public StatusEnum getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(StatusEnum statusEnum) {
        this.statusEnum = statusEnum;
    }
}

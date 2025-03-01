package com.personal.desafio_magalu_apirest.dtos;

import com.personal.desafio_magalu_apirest.entities.Notification;
import com.personal.desafio_magalu_apirest.entities.enums.ChannelEnum;
import com.personal.desafio_magalu_apirest.entities.enums.StatusEnum;

import java.time.LocalDateTime;

public record NotificationDTO(LocalDateTime dateTime,
                              String destination,
                              String message,
                              ChannelEnum channel) {


    public Notification toNotification() {

        ChannelEnum channelEnum = ChannelEnum.valueOf(String.valueOf(this.channel).toUpperCase());

        return new Notification(
                this.dateTime,
                this.destination,
                this.message,
                channelEnum,
                StatusEnum.PENDING
        );
    }
}
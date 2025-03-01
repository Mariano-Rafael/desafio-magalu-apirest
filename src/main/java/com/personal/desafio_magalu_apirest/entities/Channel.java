package com.personal.desafio_magalu_apirest.entities;

import com.personal.desafio_magalu_apirest.entities.enums.ChannelEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_channel")
public class Channel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private ChannelEnum channelEnum;

    public Channel() {
    }

    public Channel(Long id, String description, ChannelEnum channelEnum) {
        this.id = id;
        this.name = description;
        this.channelEnum = channelEnum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChannelEnum getChannelEnum() {
        return channelEnum;
    }

    public void setChannelEnum(ChannelEnum channelEnum) {
        this.channelEnum = channelEnum;
    }
}

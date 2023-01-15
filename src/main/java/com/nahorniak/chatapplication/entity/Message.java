package com.nahorniak.chatapplication.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Data
@NoArgsConstructor
public class Message {
    private String sender;
    private String content;
    private MessageType type;
    private LocalDateTime dateTime;

    public enum MessageType{
        ALIVE,
        JOINED,
        LEFT
    }

    public void setDateTime(Long milliseconds) {
        this.dateTime = Instant.ofEpochMilli(milliseconds).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}

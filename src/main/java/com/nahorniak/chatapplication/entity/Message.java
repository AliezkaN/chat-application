package com.nahorniak.chatapplication.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Message {
    private String sender;
    private String content;
    private MessageType type;

    public enum MessageType{
        ALIVE,
        JOINED,
        LEFT
    }
}

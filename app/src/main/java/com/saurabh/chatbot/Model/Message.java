package com.saurabh.chatbot.Model;

public class Message {
    public static String SENT_BY_ME = "me";
    public static String SENT_BY_BOT ="bot";

    String Message, sendby;

    public Message(String message, String sendby) {
        Message = message;
        this.sendby = sendby;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getSendby() {
        return sendby;
    }

    public void setSendby(String sendby) {
        this.sendby = sendby;
    }
}

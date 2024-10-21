package com.example.realtime.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @MessageMapping("/invoice")
    @SendTo("/topic/invoiceUpdate")
    public String sendInvoiceUpdate(String invoice) {
        return invoice; // Broadcast updated invoice
    }
}

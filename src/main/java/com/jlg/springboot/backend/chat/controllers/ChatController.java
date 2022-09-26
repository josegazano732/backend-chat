
package com.jlg.springboot.backend.chat.controllers;

import com.jlg.springboot.backend.chat.models.documents.Mensaje;
import java.util.Date;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
    
    @MessageMapping("/mensaje")
    @SendTo("/chat/mensaje")
    public Mensaje recibiendoMensaje(Mensaje mensaje){
        mensaje.setFecha(new Date().getTime());
        mensaje.setTexto("Recibido por el broker: " + mensaje.getTexto());
        
        return mensaje;
    }
    
}

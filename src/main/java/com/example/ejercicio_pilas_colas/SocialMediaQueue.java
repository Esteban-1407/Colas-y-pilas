package com.example.ejercicio_pilas_colas;


import java.util.LinkedList;
import java.util.Queue;

public class SocialMediaQueue {
    // Cola que almacena los mensajes de la red social
    private Queue<String> messageQueue;

    // Constructor que inicializa la cola
    public SocialMediaQueue() {
        messageQueue = new LinkedList<>();
    }

    // Método para encolar un nuevo mensaje en la red social
    public void addMessage(String message) {
        // Agrega el mensaje al final de la cola
        messageQueue.add(message);
        System.out.println("Mensaje agregado a la cola: " + message);
    }

    // Método para procesar (eliminar) el primer mensaje en la cola
    public void processMessage() {
        // Verifica si la cola está vacía antes de procesar
        if (messageQueue.isEmpty()) {
            System.out.println("No hay mensajes en la cola para procesar.");
        } else {
            // Procesa (elimina) el primer mensaje en la cola
            String processedMessage = messageQueue.poll();
            System.out.println("Mensaje procesado: " + processedMessage);
        }
    }

    // Método para mostrar todos los mensajes en la cola
    public void showMessages() {
        // Muestra todos los mensajes en la cola en el orden de llegada
        System.out.println("Mensajes en la cola: " + messageQueue);
    }

    // Método principal para probar la funcionalidad
    public static void main(String[] args) {
        // Crea una instancia de la cola de mensajes
        SocialMediaQueue socialMedia = new SocialMediaQueue();

        // Agrega mensajes a la cola
        socialMedia.addMessage("Hola a todos!");
        socialMedia.addMessage("Nuevo post disponible en mi perfil.");
        socialMedia.addMessage("¿Alguien quiere chatear?");

        // Muestra el contenido de la cola de mensajes
        socialMedia.showMessages();

        // Procesa los mensajes en el orden de llegada
        socialMedia.processMessage();
        socialMedia.showMessages();

        socialMedia.processMessage();
        socialMedia.showMessages();
    }
}




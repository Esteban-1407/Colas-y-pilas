package com.example.ejercicio_pilas_colas;


    import java.util.LinkedList;
import java.util.Queue;

    public class StickerQueue {
        // Declaración de la cola que almacenará los stickers
        private Queue<String> queue;

        // Constructor que inicializa la cola
        public StickerQueue() {
            queue = new LinkedList<>();
        }

        // Método para agregar un sticker a la cola
        public void encolar(String sticker) {
            // Añade el sticker al final de la cola
            queue.add(sticker);
            System.out.println("Sticker '" + sticker + "' agregado a la cola.");
        }

        // Método para eliminar el primer sticker de la cola
        public void desencolar() {
            // Verifica si la cola está vacía antes de eliminar
            if (queue.isEmpty()) {
                System.out.println("La cola está vacía. No hay stickers para desencolar.");
            } else {
                // Elimina el primer sticker en la cola (FIFO)
                String removedSticker = queue.poll();
                System.out.println("Sticker '" + removedSticker + "' eliminado de la cola.");
            }
        }

        // Método para mostrar todos los stickers en la cola
        public void mostrar() {
            // Muestra el contenido actual de la cola
            System.out.println("Cola de stickers: " + queue);
        }

        // Método para verificar si la cola está vacía
        public boolean estaVacia() {
            // Retorna verdadero si la cola no tiene elementos
            return queue.isEmpty();
        }

        // Método principal para ejecutar los ejemplos
        public static void main(String[] args) {
            // Crea una instancia de StickerQueue
            StickerQueue stickers = new StickerQueue();

            // Agrega stickers a la cola
            stickers.encolar("Sticker A");
            stickers.encolar("Sticker B");
            stickers.encolar("Sticker C");

            // Muestra el contenido actual de la cola
            stickers.mostrar();

            // Elimina el primer sticker de la cola
            stickers.desencolar();

            // Muestra el contenido actual de la cola después de desencolar
            stickers.mostrar();
        }
    }



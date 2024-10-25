package com.example.ejercicio_pilas_colas;


    import java.util.Stack;

    public class StickerStack {
        // Declaración de la pila que almacenará los stickers
        private Stack<String> stack;

        // Constructor que inicializa la pila
        public StickerStack() {
            stack = new Stack<>();
        }

        // Método para agregar un sticker a la pila
        public void apilar(String sticker) {
            // Añade el sticker al final de la pila (LIFO)
            stack.push(sticker);
            System.out.println("Sticker '" + sticker + "' agregado a la pila.");
        }

        // Método para eliminar el último sticker de la pila
        public void desapilar() {
            // Verifica si la pila está vacía antes de eliminar
            if (stack.isEmpty()) {
                System.out.println("La pila está vacía. No hay stickers para desapilar.");
            } else {
                // Elimina el último sticker en la pila (LIFO)
                String removedSticker = stack.pop();
                System.out.println("Sticker '" + removedSticker + "' eliminado de la pila.");
            }
        }

        // Método para mostrar todos los stickers en la pila
        public void mostrar() {
            // Muestra el contenido actual de la pila
            System.out.println("Pila de stickers: " + stack);
        }

        // Método para verificar si la pila está vacía
        public boolean estaVacia() {
            // Retorna verdadero si la pila no tiene elementos
            return stack.isEmpty();
        }

        // Método principal para ejecutar los ejemplos
        public static void main(String[] args) {
            // Crea una instancia de StickerStack
            StickerStack stickers = new StickerStack();

            // Agrega stickers a la pila
            stickers.apilar("Sticker A");
            stickers.apilar("Sticker B");
            stickers.apilar("Sticker C");

            // Muestra el contenido actual de la pila
            stickers.mostrar();

            // Elimina el último sticker de la pila
            stickers.desapilar();

            // Muestra el contenido actual de la pila después de desapilar
            stickers.mostrar();
        }
    }


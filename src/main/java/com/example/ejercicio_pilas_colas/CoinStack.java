package com.example.ejercicio_pilas_colas;


import java.util.Stack;

public class CoinStack {
    // Pila para almacenar monedas
    private Stack<String> coinStack;

    // Constructor que inicializa la pila
    public CoinStack() {
        coinStack = new Stack<>();
    }

    // Método para apilar una nueva moneda
    public void addCoin(String coin) {
        // Agrega la moneda al tope de la pila
        coinStack.push(coin);
        System.out.println("Moneda agregada a la pila: " + coin);
    }

    // Método para retirar la última moneda de la pila
    public void removeCoin() {
        // Verifica si la pila está vacía antes de retirar
        if (coinStack.isEmpty()) {
            System.out.println("La pila está vacía. No hay monedas para retirar.");
        } else {
            // Retira la moneda del tope de la pila
            String removedCoin = coinStack.pop();
            System.out.println("Moneda retirada: " + removedCoin);
        }
    }

    // Método para mostrar todas las monedas en la pila
    public void showCoins() {
        // Muestra todas las monedas en la pila en el orden actual
        System.out.println("Monedas en la pila: " + coinStack);
    }

    // Método principal para probar la funcionalidad
    public static void main(String[] args) {
        // Crea una instancia de la pila de monedas
        CoinStack coinStack = new CoinStack();

        // Apila algunas monedas
        coinStack.addCoin("Moneda de 1 peso");
        coinStack.addCoin("Moneda de 5 pesos");
        coinStack.addCoin("Moneda de 10 pesos");

        // Muestra el contenido de la pila de monedas
        coinStack.showCoins();

        // Retira monedas de la pila en el orden LIFO
        coinStack.removeCoin();
        coinStack.showCoins();

        coinStack.removeCoin();
        coinStack.showCoins();
    }
}


